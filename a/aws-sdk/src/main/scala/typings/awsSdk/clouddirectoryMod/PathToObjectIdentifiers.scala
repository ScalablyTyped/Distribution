package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathToObjectIdentifiers extends js.Object {
  
  /**
    * Lists ObjectIdentifiers starting from directory root to the object in the request.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.native
  
  /**
    * The path that is used to identify the object starting from directory root.
    */
  var Path: js.UndefOr[PathString] = js.native
}
object PathToObjectIdentifiers {
  
  @scala.inline
  def apply(): PathToObjectIdentifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathToObjectIdentifiers]
  }
  
  @scala.inline
  implicit class PathToObjectIdentifiersOps[Self <: PathToObjectIdentifiers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObjectIdentifiersVarargs(value: ObjectIdentifier*): Self = this.set("ObjectIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setObjectIdentifiers(value: ObjectIdentifierList): Self = this.set("ObjectIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectIdentifiers: Self = this.set("ObjectIdentifiers", js.undefined)
    
    @scala.inline
    def setPath(value: PathString): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
  }
}
