package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyGroupResult extends StObject {
  
  /**
    * The identifier for this version of the key group.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The key group that was just created.
    */
  var KeyGroup: js.UndefOr[typings.awsSdk.cloudfrontMod.KeyGroup] = js.undefined
  
  /**
    * The URL of the key group.
    */
  var Location: js.UndefOr[String] = js.undefined
}
object CreateKeyGroupResult {
  
  inline def apply(): CreateKeyGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeyGroupResult]
  }
  
  extension [Self <: CreateKeyGroupResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setKeyGroup(value: KeyGroup): Self = StObject.set(x, "KeyGroup", value.asInstanceOf[js.Any])
    
    inline def setKeyGroupUndefined: Self = StObject.set(x, "KeyGroup", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
