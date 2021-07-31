package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypes extends StObject {
  
  /**
    * The type of the object in the base commit of the merge.
    */
  var base: js.UndefOr[ObjectTypeEnum] = js.undefined
  
  /**
    * The type of the object in the destination branch.
    */
  var destination: js.UndefOr[ObjectTypeEnum] = js.undefined
  
  /**
    * The type of the object in the source branch.
    */
  var source: js.UndefOr[ObjectTypeEnum] = js.undefined
}
object ObjectTypes {
  
  @scala.inline
  def apply(): ObjectTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectTypes]
  }
  
  @scala.inline
  implicit class ObjectTypesMutableBuilder[Self <: ObjectTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: ObjectTypeEnum): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setDestination(value: ObjectTypeEnum): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setSource(value: ObjectTypeEnum): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
