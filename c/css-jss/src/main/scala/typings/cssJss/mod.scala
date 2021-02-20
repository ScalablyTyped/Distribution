package typings.cssJss

import org.scalablytyped.runtime.Shortcut
import typings.jss.mod.Jss
import typings.jss.mod.JssStyle
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("css-jss", JSImport.Default)
  @js.native
  val default: ReturnType[CreateCss] = js.native
  
  @JSImport("css-jss", "create")
  @js.native
  val create: CreateCss = js.native
  
  type CreateCss = js.Function1[/* jss */ js.UndefOr[Jss], Css]
  
  type Css = js.Function1[/* repeated */ StyleArg, String]
  
  type StyleArg = JssStyle | js.Array[JssStyle]
  
  type _To = ReturnType[CreateCss]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReturnType[CreateCss] = default
}
