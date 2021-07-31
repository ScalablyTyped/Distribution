package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Namespace
  extends StObject
     with Node
     with AtRule {
  
  /** The part following @namespace. */
  var namespace: js.UndefOr[String] = js.undefined
}
object Namespace {
  
  @scala.inline
  def apply(): Namespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Namespace]
  }
  
  @scala.inline
  implicit class NamespaceMutableBuilder[Self <: Namespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
