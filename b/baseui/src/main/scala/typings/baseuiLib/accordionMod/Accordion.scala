package typings
package baseuiLib.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/accordion", "Accordion")
@js.native
class Accordion ()
  extends reactLib.reactMod.Component[AccordionProps, AccordionState, js.Any] {
  def getItems(): reactLib.reactMod.ReactNode = js.native
  @JSName("internalSetState")
  def internalSetState_expand(`type`: baseuiLib.baseuiLibStrings.expand, changes: AccordionState): scala.Unit = js.native
  def onPanelChange(
    key: reactLib.reactMod.Key,
    onChange: js.Function0[_],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): scala.Unit = js.native
}

