package typings.codemirror.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Changed extends StObject {
  
  var changed: js.UndefOr[FromTo] = js.native
  
  var doc: typings.codemirror.mod.Doc = js.native
  
  var name: String = js.native
}
object Changed {
  
  @scala.inline
  def apply(doc: typings.codemirror.mod.Doc, name: String): Changed = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changed]
  }
  
  @scala.inline
  implicit class ChangedMutableBuilder[Self <: Changed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanged(value: FromTo): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    @scala.inline
    def setDoc(value: typings.codemirror.mod.Doc): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
