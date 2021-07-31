package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetVaultLockOutputMod {
  
  trait GetVaultLockOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The UTC date and time at which the vault lock was put into the <code>InProgress</code> state.</p>
      */
    var CreationDate: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The UTC date and time at which the lock ID expires. This value can be <code>null</code> if the vault lock is in a <code>Locked</code> state.</p>
      */
    var ExpirationDate: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The vault lock policy as a JSON string, which uses "\" as an escape character.</p>
      */
    var Policy: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The state of the vault lock. <code>InProgress</code> or <code>Locked</code>.</p>
      */
    var State: js.UndefOr[String] = js.undefined
  }
  object GetVaultLockOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetVaultLockOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVaultLockOutput]
    }
    
    @scala.inline
    implicit class GetVaultLockOutputMutableBuilder[Self <: GetVaultLockOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setExpirationDate(value: String): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
      
      @scala.inline
      def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    }
  }
}
