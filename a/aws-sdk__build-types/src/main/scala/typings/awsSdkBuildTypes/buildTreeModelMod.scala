package typings.awsSdkBuildTypes

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typings.awsSdkBuildTypes.buildApiModelMod.ApiModel
import typings.awsSdkBuildTypes.buildApiModelMod.Operation
import typings.awsSdkBuildTypes.buildApiModelMod.ShapeMap
import typings.awsSdkBuildTypes.buildApiModelMod.StructureMember
import typings.std.Blob
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTreeModelMod {
  
  trait Documented extends StObject {
    
    var documentation: String
  }
  object Documented {
    
    inline def apply(documentation: String): Documented = {
      val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Documented]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Documented] (val x: Self) extends AnyVal {
      
      inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    }
  }
  
  trait Named extends StObject {
    
    var name: String
  }
  object Named {
    
    inline def apply(name: String): Named = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Named]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Named] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type NamedAndDocumented[T] = Documented & Named & T
  
  trait NormalizedModel
    extends StObject
       with ApiModel {
    
    @JSName("operations")
    var operations_NormalizedModel: NormalizedOperationMap
  }
  object NormalizedModel {
    
    inline def apply(
      metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ Any,
      operations: NormalizedOperationMap,
      shapes: ShapeMap
    ): NormalizedModel = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NormalizedModel] (val x: Self) extends AnyVal {
      
      inline def setOperations(value: NormalizedOperationMap): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    }
  }
  
  trait NormalizedOperation
    extends StObject
       with Operation {
    
    @JSName("errors")
    var errors_NormalizedOperation: js.Array[StructureMember]
    
    @JSName("input")
    var input_NormalizedOperation: StructureMember
    
    @JSName("output")
    var output_NormalizedOperation: StructureMember
  }
  object NormalizedOperation {
    
    inline def apply(
      errors: js.Array[StructureMember],
      http: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpTrait */ Any,
      input: StructureMember,
      name: String,
      output: StructureMember
    ): NormalizedOperation = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NormalizedOperation] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[StructureMember]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: StructureMember*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setInput(value: StructureMember): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: StructureMember): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  type NormalizedOperationMap = StringDictionary[NormalizedOperation]
  
  trait TreeModel
    extends StObject
       with Documented
       with Named {
    
    var metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ Any
    
    var operations: TreeModelOperationMap
    
    var shapes: TreeModelShapeMap
  }
  object TreeModel {
    
    inline def apply(
      documentation: String,
      metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ Any,
      name: String,
      operations: TreeModelOperationMap,
      shapes: TreeModelShapeMap
    ): TreeModel = {
      val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeModel] (val x: Self) extends AnyVal {
      
      inline def setMetadata(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ Any
      ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setOperations(value: TreeModelOperationMap): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setShapes(value: TreeModelShapeMap): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List * / any */ trait TreeModelList
    extends StObject
       with Documented
       with Named {
    
    var member: TreeModelMember
  }
  object TreeModelList {
    
    inline def apply(documentation: String, member: TreeModelMember, name: String): TreeModelList = {
      val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], member = member.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeModelList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeModelList] (val x: Self) extends AnyVal {
      
      inline def setMember(value: TreeModelMember): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TreeModelMap
    extends StObject
       with Documented
       with Named
       with Map[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for K */ Any, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ Any
        ] {
    
    var key: TreeModelMember = js.native
    
    var value: TreeModelMember = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @aws-sdk/build-types.@aws-sdk/build-types/build/TreeModel.Documented ]:? @aws-sdk/build-types.@aws-sdk/build-types/build/TreeModel.Documented[P]}
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Member * / any */ trait TreeModelMember extends StObject {
    
    var shape: TreeModelShape
  }
  object TreeModelMember {
    
    inline def apply(shape: TreeModelShape): TreeModelMember = {
      val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeModelMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeModelMember] (val x: Self) extends AnyVal {
      
      inline def setShape(value: TreeModelShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperationModel * / any */ trait TreeModelOperation
    extends StObject
       with Documented
       with Named {
    
    var authtype: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion */ Any
      ] = js.undefined
    
    var errors: js.Array[TreeModelOperationMember]
    
    var input: TreeModelOperationMember
    
    var output: TreeModelOperationMember
  }
  object TreeModelOperation {
    
    inline def apply(
      documentation: String,
      errors: js.Array[TreeModelOperationMember],
      input: TreeModelOperationMember,
      name: String,
      output: TreeModelOperationMember
    ): TreeModelOperation = {
      val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeModelOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeModelOperation] (val x: Self) extends AnyVal {
      
      inline def setAuthtype(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion */ Any
      ): Self = StObject.set(x, "authtype", value.asInstanceOf[js.Any])
      
      inline def setAuthtypeUndefined: Self = StObject.set(x, "authtype", js.undefined)
      
      inline def setErrors(value: js.Array[TreeModelOperationMember]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: TreeModelOperationMember*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setInput(value: TreeModelOperationMember): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: TreeModelOperationMember): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  type TreeModelOperationMap = StringDictionary[TreeModelOperation]
  
  trait TreeModelOperationMember
    extends StObject
       with TreeModelMember {
    
    @JSName("shape")
    var shape_TreeModelOperationMember: TreeModelStructure
  }
  object TreeModelOperationMember {
    
    inline def apply(shape: TreeModelStructure): TreeModelOperationMember = {
      val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeModelOperationMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeModelOperationMember] (val x: Self) extends AnyVal {
      
      inline def setShape(value: TreeModelStructure): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
  
  type TreeModelShape = NamedAndDocumented[
    Blob | Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Float */ Any) | TreeModelString | TreeModelList | TreeModelMap | TreeModelStructure
  ]
  
  type TreeModelShapeMap = StringDictionary[TreeModelShape]
  
  @js.native
  trait TreeModelString
    extends StObject
       with Documented
       with Named
       with typings.std.String {
    
    var `enum`: js.UndefOr[js.Array[String]] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Structure * / any */ trait TreeModelStructure
    extends StObject
       with Documented
       with Named {
    
    var exception: js.UndefOr[Boolean] = js.undefined
    
    var members: StringDictionary[TreeModelMember]
    
    var topLevel: js.UndefOr[input | output] = js.undefined
  }
  object TreeModelStructure {
    
    inline def apply(documentation: String, members: StringDictionary[TreeModelMember], name: String): TreeModelStructure = {
      val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeModelStructure]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeModelStructure] (val x: Self) extends AnyVal {
      
      inline def setException(value: Boolean): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
      
      inline def setMembers(value: StringDictionary[TreeModelMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setTopLevel(value: input | output): Self = StObject.set(x, "topLevel", value.asInstanceOf[js.Any])
      
      inline def setTopLevelUndefined: Self = StObject.set(x, "topLevel", js.undefined)
    }
  }
}
