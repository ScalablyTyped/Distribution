package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvisionedThroughputDescriptionMod {
  
  trait ProvisionedThroughputDescription extends StObject {
    
    /**
      * <p>The date and time of the last provisioned throughput decrease for this table.</p>
      */
    var LastDecreaseDateTime: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>The date and time of the last provisioned throughput increase for this table.</p>
      */
    var LastIncreaseDateTime: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var NumberOfDecreasesToday: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 <code>ReadCapacityUnits</code> per second provides 100 eventually consistent <code>ReadCapacityUnits</code> per second.</p>
      */
    var ReadCapacityUnits: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
      */
    var WriteCapacityUnits: js.UndefOr[Double] = js.undefined
  }
  object ProvisionedThroughputDescription {
    
    inline def apply(): ProvisionedThroughputDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisionedThroughputDescription]
    }
    
    extension [Self <: ProvisionedThroughputDescription](x: Self) {
      
      inline def setLastDecreaseDateTime(value: js.Date | String | Double): Self = StObject.set(x, "LastDecreaseDateTime", value.asInstanceOf[js.Any])
      
      inline def setLastDecreaseDateTimeUndefined: Self = StObject.set(x, "LastDecreaseDateTime", js.undefined)
      
      inline def setLastIncreaseDateTime(value: js.Date | String | Double): Self = StObject.set(x, "LastIncreaseDateTime", value.asInstanceOf[js.Any])
      
      inline def setLastIncreaseDateTimeUndefined: Self = StObject.set(x, "LastIncreaseDateTime", js.undefined)
      
      inline def setNumberOfDecreasesToday(value: Double): Self = StObject.set(x, "NumberOfDecreasesToday", value.asInstanceOf[js.Any])
      
      inline def setNumberOfDecreasesTodayUndefined: Self = StObject.set(x, "NumberOfDecreasesToday", js.undefined)
      
      inline def setReadCapacityUnits(value: Double): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
      
      inline def setWriteCapacityUnits(value: Double): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
    }
  }
  
  trait UnmarshalledProvisionedThroughputDescription
    extends StObject
       with ProvisionedThroughputDescription {
    
    /**
      * <p>The date and time of the last provisioned throughput decrease for this table.</p>
      */
    @JSName("LastDecreaseDateTime")
    var LastDecreaseDateTime_UnmarshalledProvisionedThroughputDescription: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>The date and time of the last provisioned throughput increase for this table.</p>
      */
    @JSName("LastIncreaseDateTime")
    var LastIncreaseDateTime_UnmarshalledProvisionedThroughputDescription: js.UndefOr[js.Date] = js.undefined
  }
  object UnmarshalledProvisionedThroughputDescription {
    
    inline def apply(): UnmarshalledProvisionedThroughputDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledProvisionedThroughputDescription]
    }
    
    extension [Self <: UnmarshalledProvisionedThroughputDescription](x: Self) {
      
      inline def setLastDecreaseDateTime(value: js.Date): Self = StObject.set(x, "LastDecreaseDateTime", value.asInstanceOf[js.Any])
      
      inline def setLastDecreaseDateTimeUndefined: Self = StObject.set(x, "LastDecreaseDateTime", js.undefined)
      
      inline def setLastIncreaseDateTime(value: js.Date): Self = StObject.set(x, "LastIncreaseDateTime", value.asInstanceOf[js.Any])
      
      inline def setLastIncreaseDateTimeUndefined: Self = StObject.set(x, "LastIncreaseDateTime", js.undefined)
    }
  }
}
