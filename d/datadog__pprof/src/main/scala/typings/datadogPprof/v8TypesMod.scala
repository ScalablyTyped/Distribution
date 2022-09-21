package typings.datadogPprof

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v8TypesMod {
  
  trait Allocation extends StObject {
    
    var count: Double
    
    var sizeBytes: Double
  }
  object Allocation {
    
    inline def apply(count: Double, sizeBytes: Double): Allocation = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sizeBytes = sizeBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Allocation]
    }
    
    extension [Self <: Allocation](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setSizeBytes(value: Double): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllocationProfileNode
    extends StObject
       with ProfileNode {
    
    var allocations: js.Array[Allocation]
  }
  object AllocationProfileNode {
    
    inline def apply(allocations: js.Array[Allocation], children: js.Array[ProfileNode], scriptName: String): AllocationProfileNode = {
      val __obj = js.Dynamic.literal(allocations = allocations.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllocationProfileNode]
    }
    
    extension [Self <: AllocationProfileNode](x: Self) {
      
      inline def setAllocations(value: js.Array[Allocation]): Self = StObject.set(x, "allocations", value.asInstanceOf[js.Any])
      
      inline def setAllocationsVarargs(value: Allocation*): Self = StObject.set(x, "allocations", js.Array(value*))
    }
  }
  
  trait CodeEvent extends StObject {
    
    var address: Double
    
    var column: Double
    
    var comment: js.UndefOr[String] = js.undefined
    
    var functionName: js.UndefOr[String] = js.undefined
    
    var line: Double
    
    var previousAddress: js.UndefOr[Double] = js.undefined
    
    var scriptId: Double
    
    var scriptName: js.UndefOr[String] = js.undefined
    
    var size: Double
  }
  object CodeEvent {
    
    inline def apply(address: Double, column: Double, line: Double, scriptId: Double, size: Double): CodeEvent = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeEvent]
    }
    
    extension [Self <: CodeEvent](x: Self) {
      
      inline def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setPreviousAddress(value: Double): Self = StObject.set(x, "previousAddress", value.asInstanceOf[js.Any])
      
      inline def setPreviousAddressUndefined: Self = StObject.set(x, "previousAddress", js.undefined)
      
      inline def setScriptId(value: Double): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
      
      inline def setScriptName(value: String): Self = StObject.set(x, "scriptName", value.asInstanceOf[js.Any])
      
      inline def setScriptNameUndefined: Self = StObject.set(x, "scriptName", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait CpuProfile extends StObject {
    
    /** Time in nanoseconds at which profile was stopped. */
    var endTime: Double
    
    /** Time in nanoseconds at which profile was started. */
    var startTime: Double
    
    var topDownRoot: CpuProfileNode
  }
  object CpuProfile {
    
    inline def apply(endTime: Double, startTime: Double, topDownRoot: CpuProfileNode): CpuProfile = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], topDownRoot = topDownRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpuProfile]
    }
    
    extension [Self <: CpuProfile](x: Self) {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setTopDownRoot(value: CpuProfileNode): Self = StObject.set(x, "topDownRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait CpuProfileNode
    extends StObject
       with ProfileNode {
    
    var cpuTime: Double
    
    var hitCount: Double
    
    var labelSets: js.Array[LabelSet]
  }
  object CpuProfileNode {
    
    inline def apply(
      children: js.Array[ProfileNode],
      cpuTime: Double,
      hitCount: Double,
      labelSets: js.Array[LabelSet],
      scriptName: String
    ): CpuProfileNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], cpuTime = cpuTime.asInstanceOf[js.Any], hitCount = hitCount.asInstanceOf[js.Any], labelSets = labelSets.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpuProfileNode]
    }
    
    extension [Self <: CpuProfileNode](x: Self) {
      
      inline def setCpuTime(value: Double): Self = StObject.set(x, "cpuTime", value.asInstanceOf[js.Any])
      
      inline def setHitCount(value: Double): Self = StObject.set(x, "hitCount", value.asInstanceOf[js.Any])
      
      inline def setLabelSets(value: js.Array[LabelSet]): Self = StObject.set(x, "labelSets", value.asInstanceOf[js.Any])
      
      inline def setLabelSetsVarargs(value: LabelSet*): Self = StObject.set(x, "labelSets", js.Array(value*))
    }
  }
  
  trait CpuProfileSample extends StObject {
    
    var cpuTime: Double
    
    var labels: LabelSet
    
    var locations: js.Array[CodeEvent]
  }
  object CpuProfileSample {
    
    inline def apply(cpuTime: Double, labels: LabelSet, locations: js.Array[CodeEvent]): CpuProfileSample = {
      val __obj = js.Dynamic.literal(cpuTime = cpuTime.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpuProfileSample]
    }
    
    extension [Self <: CpuProfileSample](x: Self) {
      
      inline def setCpuTime(value: Double): Self = StObject.set(x, "cpuTime", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: LabelSet): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLocations(value: js.Array[CodeEvent]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: CodeEvent*): Self = StObject.set(x, "locations", js.Array(value*))
    }
  }
  
  trait InitialCpuProfile extends StObject {
    
    /** Time in nanoseconds at which profile was stopped. */
    var endTime: Double
    
    var samples: js.Array[CpuProfileSample]
    
    /** Time in nanoseconds at which profile was started. */
    var startTime: Double
  }
  object InitialCpuProfile {
    
    inline def apply(endTime: Double, samples: js.Array[CpuProfileSample], startTime: Double): InitialCpuProfile = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialCpuProfile]
    }
    
    extension [Self <: InitialCpuProfile](x: Self) {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setSamples(value: js.Array[CpuProfileSample]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesVarargs(value: CpuProfileSample*): Self = StObject.set(x, "samples", js.Array(value*))
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  type LabelSet = StringDictionary[String | Double]
  
  trait ProfileNode extends StObject {
    
    var children: js.Array[ProfileNode]
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var scriptId: js.UndefOr[Double] = js.undefined
    
    var scriptName: String
  }
  object ProfileNode {
    
    inline def apply(children: js.Array[ProfileNode], scriptName: String): ProfileNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileNode]
    }
    
    extension [Self <: ProfileNode](x: Self) {
      
      inline def setChildren(value: js.Array[ProfileNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ProfileNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScriptId(value: Double): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
      
      inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
      
      inline def setScriptName(value: String): Self = StObject.set(x, "scriptName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeProfile extends StObject {
    
    /** Time in nanoseconds at which profile was stopped. */
    var endTime: Double
    
    /** Time in nanoseconds at which profile was started. */
    var startTime: Double
    
    var topDownRoot: TimeProfileNode
  }
  object TimeProfile {
    
    inline def apply(endTime: Double, startTime: Double, topDownRoot: TimeProfileNode): TimeProfile = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], topDownRoot = topDownRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeProfile]
    }
    
    extension [Self <: TimeProfile](x: Self) {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setTopDownRoot(value: TimeProfileNode): Self = StObject.set(x, "topDownRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeProfileNode
    extends StObject
       with ProfileNode {
    
    var hitCount: Double
  }
  object TimeProfileNode {
    
    inline def apply(children: js.Array[ProfileNode], hitCount: Double, scriptName: String): TimeProfileNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hitCount = hitCount.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeProfileNode]
    }
    
    extension [Self <: TimeProfileNode](x: Self) {
      
      inline def setHitCount(value: Double): Self = StObject.set(x, "hitCount", value.asInstanceOf[js.Any])
    }
  }
}
