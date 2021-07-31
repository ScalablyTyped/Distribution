package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourcesOrderType extends StObject
/** SourcesOrderType enum. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesOrderType")
@js.native
object SourcesOrderType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourcesOrderType & Double] = js.native
  
  @js.native
  sealed trait ORDER_OF_DEFINITION
    extends StObject
       with SourcesOrderType
  /* 0 */ val ORDER_OF_DEFINITION: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrderType.ORDER_OF_DEFINITION & Double = js.native
  
  @js.native
  sealed trait RANDOM
    extends StObject
       with SourcesOrderType
  /* 1 */ val RANDOM: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourcesOrderType.RANDOM & Double = js.native
}
