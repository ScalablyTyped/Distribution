package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.CommonJS
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.ESNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFile
  extends StObject
     with Declaration
     with BlockLike {
  
  var amdDependencies: Array[AmdDependency] = js.native
  
  val endOfFileToken: Token[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.EndOfFileToken] = js.native
  
  var fileName: java.lang.String = js.native
  
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter = js.native
  
  def getLineEndOfPosition(pos: Double): Double = js.native
  
  def getLineStarts(): Array[Double] = js.native
  
  def getPositionOfLineAndCharacter(line: Double, character: Double): Double = js.native
  
  /**
    * lib.d.ts should have a reference comment like
    *
    *  /// <reference no-default-lib="true"/>
    *
    * If any other file has this comment, it signals not to include lib.d.ts
    * because this containing file is intended to act as a default library.
    */
  var hasNoDefaultLib: Boolean = js.native
  
  /**
    * When `module` is `Node16` or `NodeNext`, this field controls whether the
    * source file in question is an ESNext-output-format file, or a CommonJS-output-format
    * module. This is derived by the module resolver as it looks up the file, since
    * it is derived from either the file extension of the module, or the containing
    * `package.json` context, and affects both checking and emit.
    *
    * It is _public_ so that (pre)transformers can set this field,
    * since it switches the builtin `node` module transform. Generally speaking, if unset,
    * the field is treated as though it is `ModuleKind.CommonJS`.
    */
  var impliedNodeFormat: js.UndefOr[ESNext | CommonJS] = js.native
  
  var isDeclarationFile: Boolean = js.native
  
  @JSName("kind")
  val kind_SourceFile: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.SourceFile = js.native
  
  var languageVariant: LanguageVariant = js.native
  
  var languageVersion: ScriptTarget = js.native
  
  var libReferenceDirectives: Array[FileReference] = js.native
  
  var moduleName: js.UndefOr[java.lang.String] = js.native
  
  var referencedFiles: Array[FileReference] = js.native
  
  val statements: NodeArray[Statement] = js.native
  
  var text: java.lang.String = js.native
  
  var typeReferenceDirectives: Array[FileReference] = js.native
  
  def update(newText: java.lang.String, textChangeRange: TextChangeRange): SourceFile = js.native
}
