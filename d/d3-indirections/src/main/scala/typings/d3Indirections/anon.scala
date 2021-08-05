package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: String
  }
  object Error {
    
    inline def apply(error: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceIndex extends StObject {
    
    /** The index of the resource list currently being used. */
    var resourceIndex: Double
    
    /** List of resources available to pick from. */
    var resourceUids: js.Array[String]
  }
  object ResourceIndex {
    
    inline def apply(resourceIndex: Double, resourceUids: js.Array[String]): ResourceIndex = {
      val __obj = js.Dynamic.literal(resourceIndex = resourceIndex.asInstanceOf[js.Any], resourceUids = resourceUids.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceIndex]
    }
    
    extension [Self <: ResourceIndex](x: Self) {
      
      inline def setResourceIndex(value: Double): Self = StObject.set(x, "resourceIndex", value.asInstanceOf[js.Any])
      
      inline def setResourceUids(value: js.Array[String]): Self = StObject.set(x, "resourceUids", value.asInstanceOf[js.Any])
      
      inline def setResourceUidsVarargs(value: String*): Self = StObject.set(x, "resourceUids", js.Array(value :_*))
    }
  }
  
  trait ResourceUid extends StObject {
    
    /** The resource currently in use. */
    var resourceUid: String
  }
  object ResourceUid {
    
    inline def apply(resourceUid: String): ResourceUid = {
      val __obj = js.Dynamic.literal(resourceUid = resourceUid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceUid]
    }
    
    extension [Self <: ResourceUid](x: Self) {
      
      inline def setResourceUid(value: String): Self = StObject.set(x, "resourceUid", value.asInstanceOf[js.Any])
    }
  }
}
