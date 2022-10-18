package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDynamodbNumberValueMod {
  
  @JSImport("aws-sdk/lib/dynamodb/numberValue", "NumberValue")
  @js.native
  open class NumberValue protected () extends StObject {
    def this(value: String) = this()
    def this(value: Double) = this()
    
    def toJSON(): Double = js.native
    
    def toNumber(): Double = js.native
  }
}
