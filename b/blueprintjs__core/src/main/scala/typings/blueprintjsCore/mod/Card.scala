package typings.blueprintjsCore.mod

import typings.blueprintjsCore.cardMod.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Card")
@js.native
open class Card protected ()
  extends typings.blueprintjsCore.componentsMod.Card {
  def this(props: CardProps) = this()
  def this(props: CardProps, context: Any) = this()
}
/* static members */
object Card {
  
  @JSImport("@blueprintjs/core", "Card")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Card.defaultProps")
  @js.native
  def defaultProps: CardProps = js.native
  inline def defaultProps_=(x: CardProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Card.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
