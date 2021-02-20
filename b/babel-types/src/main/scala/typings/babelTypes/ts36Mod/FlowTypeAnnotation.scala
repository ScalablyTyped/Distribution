package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.AnyTypeAnnotation
import typings.babelTypes.babelTypesStrings.ArrayTypeAnnotation
import typings.babelTypes.babelTypesStrings.BooleanLiteralTypeAnnotation
import typings.babelTypes.babelTypesStrings.BooleanTypeAnnotation
import typings.babelTypes.babelTypesStrings.FunctionTypeAnnotation
import typings.babelTypes.babelTypesStrings.GenericTypeAnnotation
import typings.babelTypes.babelTypesStrings.IntersectionTypeAnnotation
import typings.babelTypes.babelTypesStrings.MixedTypeAnnotation
import typings.babelTypes.babelTypesStrings.NullableTypeAnnotation
import typings.babelTypes.babelTypesStrings.NumberTypeAnnotation
import typings.babelTypes.babelTypesStrings.NumericLiteralTypeAnnotation
import typings.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import typings.babelTypes.babelTypesStrings.StringLiteralTypeAnnotation
import typings.babelTypes.babelTypesStrings.StringTypeAnnotation
import typings.babelTypes.babelTypesStrings.ThisTypeAnnotation
import typings.babelTypes.babelTypesStrings.TupleTypeAnnotation
import typings.babelTypes.babelTypesStrings.TypeAnnotation
import typings.babelTypes.babelTypesStrings.TypeofTypeAnnotation
import typings.babelTypes.babelTypesStrings.UnionTypeAnnotation
import typings.babelTypes.babelTypesStrings.VoidTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.AnyTypeAnnotation_
  - typings.babelTypes.ts36Mod.ArrayTypeAnnotation_
  - typings.babelTypes.ts36Mod.BooleanTypeAnnotation_
  - typings.babelTypes.ts36Mod.BooleanLiteralTypeAnnotation_
  - typings.babelTypes.ts36Mod.FunctionTypeAnnotation_
  - typings.babelTypes.ts36Mod.GenericTypeAnnotation_
  - typings.babelTypes.ts36Mod.IntersectionTypeAnnotation_
  - typings.babelTypes.ts36Mod.MixedTypeAnnotation_
  - typings.babelTypes.ts36Mod.NullableTypeAnnotation_
  - typings.babelTypes.ts36Mod.NumericLiteralTypeAnnotation_
  - typings.babelTypes.ts36Mod.NumberTypeAnnotation_
  - typings.babelTypes.ts36Mod.StringLiteralTypeAnnotation_
  - typings.babelTypes.ts36Mod.StringTypeAnnotation_
  - typings.babelTypes.ts36Mod.ThisTypeAnnotation_
  - typings.babelTypes.ts36Mod.TupleTypeAnnotation_
  - typings.babelTypes.ts36Mod.TypeofTypeAnnotation_
  - typings.babelTypes.ts36Mod.TypeAnnotation_
  - typings.babelTypes.ts36Mod.ObjectTypeAnnotation_
  - typings.babelTypes.ts36Mod.UnionTypeAnnotation_
  - typings.babelTypes.ts36Mod.VoidTypeAnnotation_
*/
trait FlowTypeAnnotation extends StObject
object FlowTypeAnnotation {
  
  @scala.inline
  def AnyTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: AnyTypeAnnotation): typings.babelTypes.ts36Mod.AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.AnyTypeAnnotation_]
  }
  
  @scala.inline
  def ArrayTypeAnnotation_(
    elementType: FlowTypeAnnotation,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ArrayTypeAnnotation
  ): typings.babelTypes.ts36Mod.ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ArrayTypeAnnotation_]
  }
  
  @scala.inline
  def BooleanLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: BooleanLiteralTypeAnnotation): typings.babelTypes.ts36Mod.BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.BooleanLiteralTypeAnnotation_]
  }
  
  @scala.inline
  def BooleanTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: BooleanTypeAnnotation): typings.babelTypes.ts36Mod.BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.BooleanTypeAnnotation_]
  }
  
  @scala.inline
  def FunctionTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    params: js.Array[FunctionTypeParam_],
    rest: FunctionTypeParam_,
    returnType: FlowTypeAnnotation,
    start: Double,
    `type`: FunctionTypeAnnotation,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.ts36Mod.FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.FunctionTypeAnnotation_]
  }
  
  @scala.inline
  def GenericTypeAnnotation_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: GenericTypeAnnotation,
    typeParameters: TypeParameterInstantiation_
  ): typings.babelTypes.ts36Mod.GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.GenericTypeAnnotation_]
  }
  
  @scala.inline
  def IntersectionTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: IntersectionTypeAnnotation,
    types: js.Array[FlowTypeAnnotation]
  ): typings.babelTypes.ts36Mod.IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.IntersectionTypeAnnotation_]
  }
  
  @scala.inline
  def MixedTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: MixedTypeAnnotation): typings.babelTypes.ts36Mod.MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.MixedTypeAnnotation_]
  }
  
  @scala.inline
  def NullableTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: NullableTypeAnnotation,
    typeAnnotation: FlowTypeAnnotation
  ): typings.babelTypes.ts36Mod.NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NullableTypeAnnotation_]
  }
  
  @scala.inline
  def NumberTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: NumberTypeAnnotation): typings.babelTypes.ts36Mod.NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NumberTypeAnnotation_]
  }
  
  @scala.inline
  def NumericLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: NumericLiteralTypeAnnotation): typings.babelTypes.ts36Mod.NumericLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NumericLiteralTypeAnnotation_]
  }
  
  @scala.inline
  def ObjectTypeAnnotation_(
    callProperties: js.Array[ObjectTypeCallProperty_],
    end: Double,
    indexers: js.Array[ObjectTypeIndexer_],
    loc: SourceLocation,
    properties: js.Array[ObjectTypeProperty_],
    start: Double,
    `type`: ObjectTypeAnnotation
  ): typings.babelTypes.ts36Mod.ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ObjectTypeAnnotation_]
  }
  
  @scala.inline
  def StringLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: StringLiteralTypeAnnotation): typings.babelTypes.ts36Mod.StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.StringLiteralTypeAnnotation_]
  }
  
  @scala.inline
  def StringTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: StringTypeAnnotation): typings.babelTypes.ts36Mod.StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.StringTypeAnnotation_]
  }
  
  @scala.inline
  def ThisTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: ThisTypeAnnotation): typings.babelTypes.ts36Mod.ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ThisTypeAnnotation_]
  }
  
  @scala.inline
  def TupleTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: TupleTypeAnnotation,
    types: js.Array[FlowTypeAnnotation]
  ): typings.babelTypes.ts36Mod.TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TupleTypeAnnotation_]
  }
  
  @scala.inline
  def TypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: TypeAnnotation,
    typeAnnotation: FlowTypeAnnotation
  ): typings.babelTypes.ts36Mod.TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TypeAnnotation_]
  }
  
  @scala.inline
  def TypeofTypeAnnotation_(
    argument: FlowTypeAnnotation,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: TypeofTypeAnnotation
  ): typings.babelTypes.ts36Mod.TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TypeofTypeAnnotation_]
  }
  
  @scala.inline
  def UnionTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: UnionTypeAnnotation,
    types: js.Array[FlowTypeAnnotation]
  ): typings.babelTypes.ts36Mod.UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.UnionTypeAnnotation_]
  }
  
  @scala.inline
  def VoidTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: VoidTypeAnnotation): typings.babelTypes.ts36Mod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.VoidTypeAnnotation_]
  }
}
