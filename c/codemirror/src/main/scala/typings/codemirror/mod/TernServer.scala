package typings.codemirror.mod

import org.scalablytyped.runtime.StringDictionary
import typings.codemirror.anon.Changed
import typings.codemirror.codemirrorStrings.`type`
import typings.codemirror.codemirrorStrings.completions
import typings.codemirror.codemirrorStrings.definition
import typings.codemirror.codemirrorStrings.documentation
import typings.codemirror.codemirrorStrings.files
import typings.codemirror.codemirrorStrings.properties
import typings.codemirror.codemirrorStrings.refs
import typings.codemirror.codemirrorStrings.rename
import typings.std.Error
import typings.tern.ternMod.CompletionsQuery
import typings.tern.ternMod.CompletionsQueryResult
import typings.tern.ternMod.DefinitionQuery
import typings.tern.ternMod.DefinitionQueryResult
import typings.tern.ternMod.DocumentationQuery
import typings.tern.ternMod.DocumentationQueryResult
import typings.tern.ternMod.FilesQuery
import typings.tern.ternMod.FilesQueryResult
import typings.tern.ternMod.PropertiesQuery
import typings.tern.ternMod.PropertiesQueryResult
import typings.tern.ternMod.RefsQuery
import typings.tern.ternMod.RefsQueryResult
import typings.tern.ternMod.RenameQuery
import typings.tern.ternMod.RenameQueryResult
import typings.tern.ternMod.Server
import typings.tern.ternMod.TypeQuery
import typings.tern.ternMod.TypeQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TernServer extends StObject {
  
  def addDoc(name: String, doc: typings.codemirror.mod.Doc): typings.codemirror.anon.Doc = js.native
  
  def complete(cm: typings.codemirror.mod.Doc): Unit = js.native
  
  def delDoc(id: String): Unit = js.native
  def delDoc(id: typings.codemirror.mod.Doc): Unit = js.native
  def delDoc(id: Editor): Unit = js.native
  
  def destroy(): Unit = js.native
  
  val docs: StringDictionary[Changed] = js.native
  
  def hideDoc(id: String): Unit = js.native
  def hideDoc(id: typings.codemirror.mod.Doc): Unit = js.native
  def hideDoc(id: Editor): Unit = js.native
  
  def jumpBack(cm: typings.codemirror.mod.Doc): Unit = js.native
  
  def jumpToDef(cm: typings.codemirror.mod.Doc): Unit = js.native
  
  val options: TernOptions = js.native
  
  def rename(cm: typings.codemirror.mod.Doc): Unit = js.native
  
  def request(
    cm: typings.codemirror.mod.Doc,
    query: CompletionsQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[CompletionsQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: CompletionsQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[CompletionsQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: DefinitionQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[DefinitionQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: DefinitionQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[DefinitionQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: DocumentationQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[DocumentationQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: DocumentationQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[DocumentationQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: FilesQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[FilesQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: FilesQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[FilesQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: PropertiesQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[PropertiesQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: PropertiesQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[PropertiesQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: RefsQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[RefsQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: RefsQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[RefsQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: RenameQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[RenameQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: RenameQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[RenameQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: TypeQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[TypeQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typings.codemirror.mod.Doc,
    query: TypeQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[TypeQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  @JSName("request")
  def request_result[Q /* <: files | rename | `type` | refs | completions | documentation | properties | definition */](
    cm: typings.codemirror.mod.Doc,
    query: Q,
    callback: js.Function2[
      /* error */ js.UndefOr[Error], 
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q]['result'] */ js.Any
      ], 
      Unit
    ]
  ): Unit = js.native
  @JSName("request")
  def request_result[Q /* <: files | rename | `type` | refs | completions | documentation | properties | definition */](
    cm: typings.codemirror.mod.Doc,
    query: Q,
    callback: js.Function2[
      /* error */ js.UndefOr[Error], 
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q]['result'] */ js.Any
      ], 
      Unit
    ],
    pos: Position
  ): Unit = js.native
  
  def selectName(cm: typings.codemirror.mod.Doc): Unit = js.native
  
  val server: Server = js.native
  
  def showDocs(cm: typings.codemirror.mod.Doc): Unit = js.native
  def showDocs(cm: typings.codemirror.mod.Doc, pos: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def showDocs(cm: typings.codemirror.mod.Doc, pos: Double): Unit = js.native
  def showDocs(cm: typings.codemirror.mod.Doc, pos: Double, callback: js.Function): Unit = js.native
  def showDocs(cm: typings.codemirror.mod.Doc, pos: Position): Unit = js.native
  def showDocs(cm: typings.codemirror.mod.Doc, pos: Position, callback: js.Function): Unit = js.native
  
  def showType(cm: typings.codemirror.mod.Doc): Unit = js.native
  def showType(cm: typings.codemirror.mod.Doc, pos: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def showType(cm: typings.codemirror.mod.Doc, pos: Double): Unit = js.native
  def showType(cm: typings.codemirror.mod.Doc, pos: Double, callback: js.Function): Unit = js.native
  def showType(cm: typings.codemirror.mod.Doc, pos: Position): Unit = js.native
  def showType(cm: typings.codemirror.mod.Doc, pos: Position, callback: js.Function): Unit = js.native
  
  def updateArgHints(cm: typings.codemirror.mod.Doc): Unit = js.native
}
