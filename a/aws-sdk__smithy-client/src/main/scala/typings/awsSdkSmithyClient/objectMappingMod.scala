package typings.awsSdkSmithyClient

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMappingMod {
  
  @JSImport("@aws-sdk/smithy-client/dist-types/object-mapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertMap(target: Any): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertMap")(target.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  inline def map(instructions: Record[String, ObjectMappingInstruction]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(instructions.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def map(
    target: Any,
    filter: js.Function1[/* value */ Any, Boolean],
    instructions: Record[String, ValueSupplier | Value]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(target.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], instructions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def map(target: Any, instructions: Record[String, ObjectMappingInstruction]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(target.asInstanceOf[js.Any], instructions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type ConditionalLazyValueInstruction = js.Tuple2[FilterStatusSupplier, ValueSupplier]
  
  type ConditionalValueInstruction = js.Tuple2[ValueFilteringFunction, Value]
  
  type FilterStatus = Boolean | Any | Unit
  
  type FilterStatusSupplier = js.Function0[Boolean]
  
  type LazyValueInstruction = js.Tuple2[FilterStatus, ValueSupplier]
  
  type ObjectMappingInstruction = LazyValueInstruction | ConditionalLazyValueInstruction | SimpleValueInstruction | ConditionalValueInstruction | UnfilteredValue
  
  type ObjectMappingInstructions = Record[String, ObjectMappingInstruction]
  
  type SimpleValueInstruction = js.Tuple2[FilterStatus, Value]
  
  type UnfilteredValue = Any
  
  type Value = Any
  
  type ValueFilteringFunction = js.Function1[/* value */ Any, Boolean]
  
  type ValueSupplier = js.Function0[Any]
}
