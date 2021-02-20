package typings.awsSdkBuildTypes

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkBuildTypes.apiModelMod.ApiModel
import typings.awsSdkBuildTypes.apiModelMod.Operation
import typings.awsSdkBuildTypes.apiModelMod.ShapeMap
import typings.awsSdkBuildTypes.apiModelMod.StructureMember
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typings.std.Blob
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeModelMod {
  
  @js.native
  trait Documented extends StObject {
    
    var documentation: String = js.native
  }
  object Documented {
    
    @scala.inline
    def apply(documentation: String): Documented = {
      val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Documented]
    }
    
    @scala.inline
    implicit class DocumentedMutableBuilder[Self <: Documented] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Named extends StObject {
    
    var name: String = js.native
  }
  object Named {
    
    @scala.inline
    def apply(name: String): Named = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Named]
    }
    
    @scala.inline
    implicit class NamedMutableBuilder[Self <: Named] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type NamedAndDocumented[T] = Documented with Named with T
  
  @js.native
  trait NormalizedModel extends ApiModel {
    
    @JSName("operations")
    var operations_NormalizedModel: NormalizedOperationMap = js.native
  }
  object NormalizedModel {
    
    @scala.inline
    def apply(
      metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any,
      operations: NormalizedOperationMap,
      shapes: ShapeMap
    ): NormalizedModel = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedModel]
    }
    
    @scala.inline
    implicit class NormalizedModelMutableBuilder[Self <: NormalizedModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOperations(value: NormalizedOperationMap): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NormalizedOperation extends Operation {
    
    @JSName("errors")
    var errors_NormalizedOperation: js.Array[StructureMember] = js.native
    
    @JSName("input")
    var input_NormalizedOperation: StructureMember = js.native
    
    @JSName("output")
    var output_NormalizedOperation: StructureMember = js.native
  }
  object NormalizedOperation {
    
    @scala.inline
    def apply(
      errors: js.Array[StructureMember],
      http: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpTrait */ js.Any,
      input: StructureMember,
      name: String,
      output: StructureMember
    ): NormalizedOperation = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedOperation]
    }
    
    @scala.inline
    implicit class NormalizedOperationMutableBuilder[Self <: NormalizedOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[StructureMember]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: StructureMember*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setInput(value: StructureMember): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: StructureMember): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  type NormalizedOperationMap = StringDictionary[NormalizedOperation]
  
  @js.native
  trait TreeModel
    extends Documented
       with Named {
    
    var metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any = js.native
    
    var operations: TreeModelOperationMap = js.native
    
    var shapes: TreeModelShapeMap = js.native
  }
  object TreeModel {
    
    @scala.inline
    def apply(
      documentation: String,
      metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any,
      name: String,
      operations: TreeModelOperationMap,
      shapes: TreeModelShapeMap
    ): TreeModel = {
      val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeModel]
    }
    
    @scala.inline
    implicit class TreeModelMutableBuilder[Self <: TreeModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any
      ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperations(value: TreeModelOperationMap): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapes(value: TreeModelShapeMap): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List * / any */ @js.native
  trait TreeModelList
    extends Documented
       with Named {
    
    var member: TreeModelMember = js.native
  }
  object TreeModelList {
    
    @scala.inline
    def apply(documentation: String, member: TreeModelMember, name: String): TreeModelList = {
      val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], member = member.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeModelList]
    }
    
    @scala.inline
    implicit class TreeModelListMutableBuilder[Self <: TreeModelList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMember(value: TreeModelMember): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TreeModelMap
    extends Documented
       with Named
       with Map[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for K */ js.Any, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ js.Any
        ] {
    
    var key: TreeModelMember = js.native
    
    var value: TreeModelMember = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @aws-sdk/build-types.@aws-sdk/build-types/build/TreeModel.Documented ]:? @aws-sdk/build-types.@aws-sdk/build-types/build/TreeModel.Documented[P]}
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Member * / any */ @js.native
  trait TreeModelMember extends StObject {
    
    var shape: TreeModelShape = js.native
  }
  object TreeModelMember {
    
    @scala.inline
    def apply(shape: TreeModelShape): TreeModelMember = {
      val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeModelMember]
    }
    
    @scala.inline
    implicit class TreeModelMemberMutableBuilder[Self <: TreeModelMember] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShape(value: TreeModelShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperationModel * / any */ @js.native
  trait TreeModelOperation
    extends Documented
       with Named {
    
    var authtype: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion */ js.Any
      ] = js.native
    
    var errors: js.Array[TreeModelOperationMember] = js.native
    
    var input: TreeModelOperationMember = js.native
    
    var output: TreeModelOperationMember = js.native
  }
  object TreeModelOperation {
    
    @scala.inline
    def apply(
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
    implicit class TreeModelOperationMutableBuilder[Self <: TreeModelOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthtype(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion */ js.Any
      ): Self = StObject.set(x, "authtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthtypeUndefined: Self = StObject.set(x, "authtype", js.undefined)
      
      @scala.inline
      def setErrors(value: js.Array[TreeModelOperationMember]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: TreeModelOperationMember*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setInput(value: TreeModelOperationMember): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: TreeModelOperationMember): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  type TreeModelOperationMap = StringDictionary[TreeModelOperation]
  
  @js.native
  trait TreeModelOperationMember extends TreeModelMember {
    
    @JSName("shape")
    var shape_TreeModelOperationMember: TreeModelStructure = js.native
  }
  object TreeModelOperationMember {
    
    @scala.inline
    def apply(shape: TreeModelStructure): TreeModelOperationMember = {
      val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeModelOperationMember]
    }
    
    @scala.inline
    implicit class TreeModelOperationMemberMutableBuilder[Self <: TreeModelOperationMember] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShape(value: TreeModelStructure): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
  
  type TreeModelShape = NamedAndDocumented[
    Blob | Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Float */ js.Any) | TreeModelString | TreeModelList | TreeModelMap | TreeModelStructure
  ]
  
  type TreeModelShapeMap = StringDictionary[TreeModelShape]
  
  @js.native
  trait TreeModelString
    extends typings.std.String
       with Documented
       with Named {
    
    var enum: js.UndefOr[js.Array[String]] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Structure * / any */ @js.native
  trait TreeModelStructure
    extends Documented
       with Named {
    
    var exception: js.UndefOr[Boolean] = js.native
    
    var members: StringDictionary[TreeModelMember] = js.native
    
    var topLevel: js.UndefOr[input | output] = js.native
  }
  object TreeModelStructure {
    
    @scala.inline
    def apply(documentation: String, members: StringDictionary[TreeModelMember], name: String): TreeModelStructure = {
      val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeModelStructure]
    }
    
    @scala.inline
    implicit class TreeModelStructureMutableBuilder[Self <: TreeModelStructure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setException(value: Boolean): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
      
      @scala.inline
      def setMembers(value: StringDictionary[TreeModelMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLevel(value: input | output): Self = StObject.set(x, "topLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLevelUndefined: Self = StObject.set(x, "topLevel", js.undefined)
    }
  }
}
