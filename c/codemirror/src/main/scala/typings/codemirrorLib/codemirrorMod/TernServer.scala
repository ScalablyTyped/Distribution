package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TernServer extends js.Object {
  val docs: org.scalablytyped.runtime.StringDictionary[codemirrorLib.Anon_Changed] = js.native
  val options: TernOptions = js.native
  val server: ternLib.libTernMod.Server = js.native
  def addDoc(name: java.lang.String, doc: Doc): codemirrorLib.Anon_ChangedDoc = js.native
  def complete(cm: Doc): scala.Unit = js.native
  def delDoc(id: Doc): scala.Unit = js.native
  def delDoc(id: Editor): scala.Unit = js.native
  def delDoc(id: java.lang.String): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def hideDoc(id: Doc): scala.Unit = js.native
  def hideDoc(id: Editor): scala.Unit = js.native
  def hideDoc(id: java.lang.String): scala.Unit = js.native
  def jumpBack(cm: Doc): scala.Unit = js.native
  def jumpToDef(cm: Doc): scala.Unit = js.native
  def rename(cm: Doc): scala.Unit = js.native
  def request[Q /* <: ternLib.libTernMod.Query */](
    cm: Doc,
    query: Q,
    callback: js.Function2[
      /* error */ js.UndefOr[stdLib.Error], 
      /* data */ js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def request[Q /* <: ternLib.libTernMod.Query */](
    cm: Doc,
    query: Q,
    callback: js.Function2[
      /* error */ js.UndefOr[stdLib.Error], 
      /* data */ js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
      ], 
      scala.Unit
    ],
    pos: Position
  ): scala.Unit = js.native
  @JSName("request")
  def request_result[Q /* <: /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */](
    cm: Doc,
    query: Q,
    callback: js.Function2[
      /* error */ js.UndefOr[stdLib.Error], 
      /* data */ js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q]['result'] */ js.Any
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("request")
  def request_result[Q /* <: /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */](
    cm: Doc,
    query: Q,
    callback: js.Function2[
      /* error */ js.UndefOr[stdLib.Error], 
      /* data */ js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q]['result'] */ js.Any
      ], 
      scala.Unit
    ],
    pos: Position
  ): scala.Unit = js.native
  def selectName(cm: Doc): scala.Unit = js.native
  def showDocs(cm: Doc): scala.Unit = js.native
  def showDocs(cm: Doc, pos: Position): scala.Unit = js.native
  def showDocs(cm: Doc, pos: Position, callback: js.Function): scala.Unit = js.native
  def showDocs(cm: Doc, pos: scala.Double): scala.Unit = js.native
  def showDocs(cm: Doc, pos: scala.Double, callback: js.Function): scala.Unit = js.native
  def showType(cm: Doc): scala.Unit = js.native
  def showType(cm: Doc, pos: Position): scala.Unit = js.native
  def showType(cm: Doc, pos: Position, callback: js.Function): scala.Unit = js.native
  def showType(cm: Doc, pos: scala.Double): scala.Unit = js.native
  def showType(cm: Doc, pos: scala.Double, callback: js.Function): scala.Unit = js.native
  def updateArgHints(cm: Doc): scala.Unit = js.native
}

@JSImport("codemirror", "TernServer")
@js.native
class TernServerCls () extends TernServer {
  def this(options: TernOptions) = this()
}

