package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaDescriptionMod {
  
  trait ReplicaDescription extends StObject {
    
    /**
      * <p>The name of the region.</p>
      */
    var RegionName: js.UndefOr[String] = js.undefined
  }
  object ReplicaDescription {
    
    inline def apply(): ReplicaDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaDescription]
    }
    
    extension [Self <: ReplicaDescription](x: Self) {
      
      inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    }
  }
  
  type UnmarshalledReplicaDescription = ReplicaDescription
}
