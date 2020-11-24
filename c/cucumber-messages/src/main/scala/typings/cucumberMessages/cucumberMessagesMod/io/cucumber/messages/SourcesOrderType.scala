package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourcesOrderType extends js.Object
/** SourcesOrderType enum. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesOrderType")
@js.native
object SourcesOrderType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourcesOrderType with Double] = js.native
  
  @js.native
  sealed trait ORDER_OF_DEFINITION extends SourcesOrderType
  /* 0 */ @js.native
  object ORDER_OF_DEFINITION extends TopLevel[ORDER_OF_DEFINITION with Double]
  
  @js.native
  sealed trait RANDOM extends SourcesOrderType
  /* 1 */ @js.native
  object RANDOM extends TopLevel[RANDOM with Double]
}
