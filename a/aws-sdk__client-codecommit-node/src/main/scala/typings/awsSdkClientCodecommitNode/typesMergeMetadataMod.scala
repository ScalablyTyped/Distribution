package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMergeMetadataMod {
  
  trait MergeMetadata extends StObject {
    
    /**
      * <p>A Boolean value indicating whether the merge has been made.</p>
      */
    var isMerged: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) of the user who merged the branches.</p>
      */
    var mergedBy: js.UndefOr[String] = js.undefined
  }
  object MergeMetadata {
    
    @scala.inline
    def apply(): MergeMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeMetadata]
    }
    
    @scala.inline
    implicit class MergeMetadataMutableBuilder[Self <: MergeMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMerged(value: Boolean): Self = StObject.set(x, "isMerged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMergedUndefined: Self = StObject.set(x, "isMerged", js.undefined)
      
      @scala.inline
      def setMergedBy(value: String): Self = StObject.set(x, "mergedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergedByUndefined: Self = StObject.set(x, "mergedBy", js.undefined)
    }
  }
  
  type UnmarshalledMergeMetadata = MergeMetadata
}
