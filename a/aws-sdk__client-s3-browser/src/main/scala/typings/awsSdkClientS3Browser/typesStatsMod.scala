package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStatsMod {
  
  trait Stats extends StObject {
    
    /**
      * <p>Total number of uncompressed object bytes processed.</p>
      */
    var BytesProcessed: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Total number of bytes of records payload data returned.</p>
      */
    var BytesReturned: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Total number of object bytes scanned.</p>
      */
    var BytesScanned: js.UndefOr[Double] = js.undefined
  }
  object Stats {
    
    @scala.inline
    def apply(): Stats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesProcessed(value: Double): Self = StObject.set(x, "BytesProcessed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesProcessedUndefined: Self = StObject.set(x, "BytesProcessed", js.undefined)
      
      @scala.inline
      def setBytesReturned(value: Double): Self = StObject.set(x, "BytesReturned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesReturnedUndefined: Self = StObject.set(x, "BytesReturned", js.undefined)
      
      @scala.inline
      def setBytesScanned(value: Double): Self = StObject.set(x, "BytesScanned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesScannedUndefined: Self = StObject.set(x, "BytesScanned", js.undefined)
    }
  }
  
  type UnmarshalledStats = Stats
}
