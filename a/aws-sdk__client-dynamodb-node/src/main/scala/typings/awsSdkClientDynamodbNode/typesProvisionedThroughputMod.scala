package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvisionedThroughputMod {
  
  trait ProvisionedThroughput extends StObject {
    
    /**
      * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ReadCapacityUnits: Double
    
    /**
      * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var WriteCapacityUnits: Double
  }
  object ProvisionedThroughput {
    
    @scala.inline
    def apply(ReadCapacityUnits: Double, WriteCapacityUnits: Double): ProvisionedThroughput = {
      val __obj = js.Dynamic.literal(ReadCapacityUnits = ReadCapacityUnits.asInstanceOf[js.Any], WriteCapacityUnits = WriteCapacityUnits.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvisionedThroughput]
    }
    
    @scala.inline
    implicit class ProvisionedThroughputMutableBuilder[Self <: ProvisionedThroughput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadCapacityUnits(value: Double): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteCapacityUnits(value: Double): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledProvisionedThroughput = ProvisionedThroughput
}
