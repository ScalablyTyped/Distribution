package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSolNetworkPackageInput extends StObject {
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateSolNetworkPackageInput {
  
  inline def apply(): CreateSolNetworkPackageInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSolNetworkPackageInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSolNetworkPackageInput] (val x: Self) extends AnyVal {
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
