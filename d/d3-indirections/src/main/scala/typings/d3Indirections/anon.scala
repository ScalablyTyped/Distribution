package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: String
  }
  object Error {
    
    @scala.inline
    def apply(error: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceIndex extends StObject {
    
    /** The index of the resource list currently being used. */
    var resourceIndex: Double
    
    /** List of resources available to pick from. */
    var resourceUids: js.Array[String]
  }
  object ResourceIndex {
    
    @scala.inline
    def apply(resourceIndex: Double, resourceUids: js.Array[String]): ResourceIndex = {
      val __obj = js.Dynamic.literal(resourceIndex = resourceIndex.asInstanceOf[js.Any], resourceUids = resourceUids.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceIndex]
    }
    
    @scala.inline
    implicit class ResourceIndexMutableBuilder[Self <: ResourceIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceIndex(value: Double): Self = StObject.set(x, "resourceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUids(value: js.Array[String]): Self = StObject.set(x, "resourceUids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUidsVarargs(value: String*): Self = StObject.set(x, "resourceUids", js.Array(value :_*))
    }
  }
  
  trait ResourceUid extends StObject {
    
    /** The resource currently in use. */
    var resourceUid: String
  }
  object ResourceUid {
    
    @scala.inline
    def apply(resourceUid: String): ResourceUid = {
      val __obj = js.Dynamic.literal(resourceUid = resourceUid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceUid]
    }
    
    @scala.inline
    implicit class ResourceUidMutableBuilder[Self <: ResourceUid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceUid(value: String): Self = StObject.set(x, "resourceUid", value.asInstanceOf[js.Any])
    }
  }
}
