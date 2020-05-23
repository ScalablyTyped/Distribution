package typings.codemirror.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TernServer extends js.Object {
  val docs: StringDictionary[Changed] = js.native
  val options: TernOptions = js.native
  val server: Server = js.native
  def addDoc(name: String, doc: Doc): typings.codemirror.anon.Doc = js.native
  def complete(cm: Doc): Unit = js.native
  def delDoc(id: String): Unit = js.native
  def delDoc(id: Doc): Unit = js.native
  def delDoc(id: Editor): Unit = js.native
  def destroy(): Unit = js.native
  def hideDoc(id: String): Unit = js.native
  def hideDoc(id: Doc): Unit = js.native
  def hideDoc(id: Editor): Unit = js.native
  def jumpBack(cm: Doc): Unit = js.native
  def jumpToDef(cm: Doc): Unit = js.native
  def rename(cm: Doc): Unit = js.native
  def request(
    cm: Doc,
    query: CompletionsQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[CompletionsQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: CompletionsQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[CompletionsQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: DefinitionQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[DefinitionQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: DefinitionQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[DefinitionQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: DocumentationQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[DocumentationQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: DocumentationQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[DocumentationQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: FilesQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[FilesQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: FilesQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[FilesQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: PropertiesQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[PropertiesQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: PropertiesQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[PropertiesQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: RefsQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[RefsQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: RefsQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[RefsQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: RenameQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[RenameQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: RenameQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[RenameQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: TypeQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[TypeQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: TypeQuery,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[TypeQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  @JSName("request")
  def request_result[Q /* <: `type` | files | refs | rename | definition | completions | properties | documentation */](
    cm: Doc,
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
  def request_result[Q /* <: `type` | files | refs | rename | definition | completions | properties | documentation */](
    cm: Doc,
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
  def selectName(cm: Doc): Unit = js.native
  def showDocs(cm: Doc): Unit = js.native
  def showDocs(cm: Doc, pos: Double): Unit = js.native
  def showDocs(cm: Doc, pos: Double, callback: js.Function): Unit = js.native
  def showDocs(cm: Doc, pos: Position): Unit = js.native
  def showDocs(cm: Doc, pos: Position, callback: js.Function): Unit = js.native
  def showType(cm: Doc): Unit = js.native
  def showType(cm: Doc, pos: Double): Unit = js.native
  def showType(cm: Doc, pos: Double, callback: js.Function): Unit = js.native
  def showType(cm: Doc, pos: Position): Unit = js.native
  def showType(cm: Doc, pos: Position, callback: js.Function): Unit = js.native
  def updateArgHints(cm: Doc): Unit = js.native
}

@JSImport("codemirror", "TernServer")
@js.native
object TernServer extends TopLevel[TernConstructor]

