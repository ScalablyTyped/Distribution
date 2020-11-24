package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectTypes extends js.Object {
  
  /**
    * The type of the object in the base commit of the merge.
    */
  var base: js.UndefOr[ObjectTypeEnum] = js.native
  
  /**
    * The type of the object in the destination branch.
    */
  var destination: js.UndefOr[ObjectTypeEnum] = js.native
  
  /**
    * The type of the object in the source branch.
    */
  var source: js.UndefOr[ObjectTypeEnum] = js.native
}
object ObjectTypes {
  
  @scala.inline
  def apply(): ObjectTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectTypes]
  }
  
  @scala.inline
  implicit class ObjectTypesOps[Self <: ObjectTypes] (val x: Self) extends AnyVal {
    
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
    def setBase(value: ObjectTypeEnum): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setDestination(value: ObjectTypeEnum): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setSource(value: ObjectTypeEnum): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
