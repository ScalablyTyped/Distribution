package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiInstanceLoopCharacteristics
  extends StObject
     with BaseElement {
  
  var behavior: MultiInstanceBehaviour
  
  var completionCondition: Expression
  
  var complexBehaviorDefinition: ComplexBehaviorDefinition
  
  var inputDataItem: DataInput
  
  var isSequential: Boolean
  
  var loopCardinality: Expression
  
  var loopDataInputRef: ItemAwareElement
  
  var loopDataOutputRef: ItemAwareElement
  
  var noneBehaviorEventRef: EventDefinition
  
  var oneBehaviorEventRef: EventDefinition
  
  var outputDataItem: DataOutput
}
object MultiInstanceLoopCharacteristics {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    behavior: MultiInstanceBehaviour,
    completionCondition: Expression,
    complexBehaviorDefinition: ComplexBehaviorDefinition,
    id: String,
    inputDataItem: DataInput,
    isSequential: Boolean,
    loopCardinality: Expression,
    loopDataInputRef: ItemAwareElement,
    loopDataOutputRef: ItemAwareElement,
    noneBehaviorEventRef: EventDefinition,
    oneBehaviorEventRef: EventDefinition,
    outputDataItem: DataOutput
  ): MultiInstanceLoopCharacteristics = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], behavior = behavior.asInstanceOf[js.Any], completionCondition = completionCondition.asInstanceOf[js.Any], complexBehaviorDefinition = complexBehaviorDefinition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputDataItem = inputDataItem.asInstanceOf[js.Any], isSequential = isSequential.asInstanceOf[js.Any], loopCardinality = loopCardinality.asInstanceOf[js.Any], loopDataInputRef = loopDataInputRef.asInstanceOf[js.Any], loopDataOutputRef = loopDataOutputRef.asInstanceOf[js.Any], noneBehaviorEventRef = noneBehaviorEventRef.asInstanceOf[js.Any], oneBehaviorEventRef = oneBehaviorEventRef.asInstanceOf[js.Any], outputDataItem = outputDataItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiInstanceLoopCharacteristics]
  }
  
  extension [Self <: MultiInstanceLoopCharacteristics](x: Self) {
    
    inline def setBehavior(value: MultiInstanceBehaviour): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setCompletionCondition(value: Expression): Self = StObject.set(x, "completionCondition", value.asInstanceOf[js.Any])
    
    inline def setComplexBehaviorDefinition(value: ComplexBehaviorDefinition): Self = StObject.set(x, "complexBehaviorDefinition", value.asInstanceOf[js.Any])
    
    inline def setInputDataItem(value: DataInput): Self = StObject.set(x, "inputDataItem", value.asInstanceOf[js.Any])
    
    inline def setIsSequential(value: Boolean): Self = StObject.set(x, "isSequential", value.asInstanceOf[js.Any])
    
    inline def setLoopCardinality(value: Expression): Self = StObject.set(x, "loopCardinality", value.asInstanceOf[js.Any])
    
    inline def setLoopDataInputRef(value: ItemAwareElement): Self = StObject.set(x, "loopDataInputRef", value.asInstanceOf[js.Any])
    
    inline def setLoopDataOutputRef(value: ItemAwareElement): Self = StObject.set(x, "loopDataOutputRef", value.asInstanceOf[js.Any])
    
    inline def setNoneBehaviorEventRef(value: EventDefinition): Self = StObject.set(x, "noneBehaviorEventRef", value.asInstanceOf[js.Any])
    
    inline def setOneBehaviorEventRef(value: EventDefinition): Self = StObject.set(x, "oneBehaviorEventRef", value.asInstanceOf[js.Any])
    
    inline def setOutputDataItem(value: DataOutput): Self = StObject.set(x, "outputDataItem", value.asInstanceOf[js.Any])
  }
}
