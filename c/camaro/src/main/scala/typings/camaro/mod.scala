package typings.camaro

import typings.camaro.anon.IndentSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("camaro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def prettyPrint(xml: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(xml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def prettyPrint(xml: String, opts: IndentSize): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(xml.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def toJson(xml: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(xml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def transform(xml: String, template: js.Object): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(xml.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
