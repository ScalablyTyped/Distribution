package typings.awsSdkClientDynamodbBrowser

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvisionedThroughputDescriptionMod {
  
  @js.native
  trait ProvisionedThroughputDescription extends StObject {
    
    /**
      * <p>The date and time of the last provisioned throughput decrease for this table.</p>
      */
    var LastDecreaseDateTime: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>The date and time of the last provisioned throughput increase for this table.</p>
      */
    var LastIncreaseDateTime: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var NumberOfDecreasesToday: js.UndefOr[Double] = js.native
    
    /**
      * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 <code>ReadCapacityUnits</code> per second provides 100 eventually consistent <code>ReadCapacityUnits</code> per second.</p>
      */
    var ReadCapacityUnits: js.UndefOr[Double] = js.native
    
    /**
      * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
      */
    var WriteCapacityUnits: js.UndefOr[Double] = js.native
  }
  object ProvisionedThroughputDescription {
    
    @scala.inline
    def apply(): ProvisionedThroughputDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisionedThroughputDescription]
    }
    
    @scala.inline
    implicit class ProvisionedThroughputDescriptionMutableBuilder[Self <: ProvisionedThroughputDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastDecreaseDateTime(value: Date | String | Double): Self = StObject.set(x, "LastDecreaseDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastDecreaseDateTimeUndefined: Self = StObject.set(x, "LastDecreaseDateTime", js.undefined)
      
      @scala.inline
      def setLastIncreaseDateTime(value: Date | String | Double): Self = StObject.set(x, "LastIncreaseDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastIncreaseDateTimeUndefined: Self = StObject.set(x, "LastIncreaseDateTime", js.undefined)
      
      @scala.inline
      def setNumberOfDecreasesToday(value: Double): Self = StObject.set(x, "NumberOfDecreasesToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfDecreasesTodayUndefined: Self = StObject.set(x, "NumberOfDecreasesToday", js.undefined)
      
      @scala.inline
      def setReadCapacityUnits(value: Double): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
      
      @scala.inline
      def setWriteCapacityUnits(value: Double): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledProvisionedThroughputDescription extends ProvisionedThroughputDescription {
    
    /**
      * <p>The date and time of the last provisioned throughput decrease for this table.</p>
      */
    @JSName("LastDecreaseDateTime")
    var LastDecreaseDateTime_UnmarshalledProvisionedThroughputDescription: js.UndefOr[Date] = js.native
    
    /**
      * <p>The date and time of the last provisioned throughput increase for this table.</p>
      */
    @JSName("LastIncreaseDateTime")
    var LastIncreaseDateTime_UnmarshalledProvisionedThroughputDescription: js.UndefOr[Date] = js.native
  }
  object UnmarshalledProvisionedThroughputDescription {
    
    @scala.inline
    def apply(): UnmarshalledProvisionedThroughputDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledProvisionedThroughputDescription]
    }
    
    @scala.inline
    implicit class UnmarshalledProvisionedThroughputDescriptionMutableBuilder[Self <: UnmarshalledProvisionedThroughputDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastDecreaseDateTime(value: Date): Self = StObject.set(x, "LastDecreaseDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastDecreaseDateTimeUndefined: Self = StObject.set(x, "LastDecreaseDateTime", js.undefined)
      
      @scala.inline
      def setLastIncreaseDateTime(value: Date): Self = StObject.set(x, "LastIncreaseDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastIncreaseDateTimeUndefined: Self = StObject.set(x, "LastIncreaseDateTime", js.undefined)
    }
  }
}
