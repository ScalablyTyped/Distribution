package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  /**
    * The objects to delete.
    */
  var Objects: ObjectIdentifierList
  
  /**
    * Element to enable quiet mode for the request. When you add this element, you must set its value to true.
    */
  var Quiet: js.UndefOr[typings.awsSdk.s3Mod.Quiet] = js.undefined
}
object Delete {
  
  @scala.inline
  def apply(Objects: ObjectIdentifierList): Delete = {
    val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  
  @scala.inline
  implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjects(value: ObjectIdentifierList): Self = StObject.set(x, "Objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "Objects", js.Array(value :_*))
    
    @scala.inline
    def setQuiet(value: Quiet): Self = StObject.set(x, "Quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuietUndefined: Self = StObject.set(x, "Quiet", js.undefined)
  }
}
