package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDataRetrievalRuleMod {
  
  trait DataRetrievalRule extends StObject {
    
    /**
      * <p>The maximum number of bytes that can be retrieved in an hour.</p> <p>This field is required only if the value of the Strategy field is <code>BytesPerHour</code>. Your PUT operation will be rejected if the Strategy field is not set to <code>BytesPerHour</code> and you set this field.</p>
      */
    var BytesPerHour: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The type of data retrieval policy to set.</p> <p>Valid values: BytesPerHour|FreeTier|None</p>
      */
    var Strategy: js.UndefOr[String] = js.undefined
  }
  object DataRetrievalRule {
    
    @scala.inline
    def apply(): DataRetrievalRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataRetrievalRule]
    }
    
    @scala.inline
    implicit class DataRetrievalRuleMutableBuilder[Self <: DataRetrievalRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesPerHour(value: Double): Self = StObject.set(x, "BytesPerHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesPerHourUndefined: Self = StObject.set(x, "BytesPerHour", js.undefined)
      
      @scala.inline
      def setStrategy(value: String): Self = StObject.set(x, "Strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "Strategy", js.undefined)
    }
  }
  
  type UnmarshalledDataRetrievalRule = DataRetrievalRule
}
