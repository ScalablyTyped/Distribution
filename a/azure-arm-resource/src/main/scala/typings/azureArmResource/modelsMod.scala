package typings.azureArmResource

import typings.msRestAzure.mod.CloudErrorParameters
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsMod {
  
  @JSImport("azure-arm-resource/lib/feature/models", "BaseResource")
  @js.native
  class BaseResource ()
    extends typings.msRestAzure.mod.BaseResource
  
  @JSImport("azure-arm-resource/lib/feature/models", "CloudError")
  @js.native
  class CloudError protected ()
    extends typings.msRestAzure.mod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
  @js.native
  trait FeatureOperationsListResult
    extends StObject
       with Array[FeatureResult] {
    
    /**
      * The URL to use for getting the next set of results.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
  
  trait FeatureProperties extends StObject {
    
    /**
      * The registration state of the feature for the subscription.
      */
    var state: js.UndefOr[String] = js.undefined
  }
  object FeatureProperties {
    
    @scala.inline
    def apply(): FeatureProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureProperties]
    }
    
    @scala.inline
    implicit class FeaturePropertiesMutableBuilder[Self <: FeatureProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait FeatureResult extends StObject {
    
    /**
      * The resource ID of the feature.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the feature.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Properties of the previewed feature.
      */
    var properties: js.UndefOr[FeatureProperties] = js.undefined
    
    /**
      * The resource type of the feature.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FeatureResult {
    
    @scala.inline
    def apply(): FeatureResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureResult]
    }
    
    @scala.inline
    implicit class FeatureResultMutableBuilder[Self <: FeatureResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProperties(value: FeatureProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Operation extends StObject {
    
    /**
      * The object that represents the operation.
      */
    var display: js.UndefOr[OperationDisplay] = js.undefined
    
    /**
      * Operation name: {provider}/{resource}/{operation}
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object Operation {
    
    @scala.inline
    def apply(): Operation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Operation]
    }
    
    @scala.inline
    implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: OperationDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait OperationDisplay extends StObject {
    
    /**
      * Operation type: Read, write, delete, etc.
      */
    var operation: js.UndefOr[String] = js.undefined
    
    /**
      * Service provider: Microsoft.Features
      */
    var provider: js.UndefOr[String] = js.undefined
    
    /**
      * Resource on which the operation is performed: Profile, endpoint, etc.
      */
    var resource: js.UndefOr[String] = js.undefined
  }
  object OperationDisplay {
    
    @scala.inline
    def apply(): OperationDisplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationDisplay]
    }
    
    @scala.inline
    implicit class OperationDisplayMutableBuilder[Self <: OperationDisplay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    }
  }
  
  @js.native
  trait OperationListResult
    extends StObject
       with Array[Operation] {
    
    /**
      * URL to get the next set of operation list results if there are any.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
}
