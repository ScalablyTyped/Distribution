package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiInstanceLoopCharacteristics extends BaseElement {
  
  var behavior: MultiInstanceBehaviour = js.native
  
  var completionCondition: Expression = js.native
  
  var complexBehaviorDefinition: ComplexBehaviorDefinition = js.native
  
  var inputDataItem: DataInput = js.native
  
  var isSequential: Boolean = js.native
  
  var loopCardinality: Expression = js.native
  
  var loopDataInputRef: ItemAwareElement = js.native
  
  var loopDataOutputRef: ItemAwareElement = js.native
  
  var noneBehaviorEventRef: EventDefinition = js.native
  
  var oneBehaviorEventRef: EventDefinition = js.native
  
  var outputDataItem: DataOutput = js.native
}
object MultiInstanceLoopCharacteristics {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class MultiInstanceLoopCharacteristicsOps[Self <: MultiInstanceLoopCharacteristics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBehavior(value: MultiInstanceBehaviour): Self = this.set("behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionCondition(value: Expression): Self = this.set("completionCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplexBehaviorDefinition(value: ComplexBehaviorDefinition): Self = this.set("complexBehaviorDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataItem(value: DataInput): Self = this.set("inputDataItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSequential(value: Boolean): Self = this.set("isSequential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopCardinality(value: Expression): Self = this.set("loopCardinality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopDataInputRef(value: ItemAwareElement): Self = this.set("loopDataInputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopDataOutputRef(value: ItemAwareElement): Self = this.set("loopDataOutputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneBehaviorEventRef(value: EventDefinition): Self = this.set("noneBehaviorEventRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneBehaviorEventRef(value: EventDefinition): Self = this.set("oneBehaviorEventRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDataItem(value: DataOutput): Self = this.set("outputDataItem", value.asInstanceOf[js.Any])
  }
}
