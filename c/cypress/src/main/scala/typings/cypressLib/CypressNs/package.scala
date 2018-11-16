package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CypressNs {
  // Diff / Omit taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-311923766
  type Diff[T /* <: java.lang.String */, U /* <: java.lang.String */] = /* import warning: Failed type conversion: TsTypeLookup(TsTypeIntersect(List(TsTypeObject(List(TsMemberTypeMapped(NoComments,Default,false,TsIdentSimple(P),TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Noop,TsTypeRef(TsQIdent(List(TsIdentSimple(P))),List())))), TsTypeObject(List(TsMemberTypeMapped(NoComments,Default,false,TsIdentSimple(P),TsTypeRef(TsQIdent(List(TsIdentSimple(U))),List()),Noop,TsTypeRef(TsQIdent(List(TsIdentSimple(never))),List())))), TsTypeObject(List(TsMemberIndex(NoComments,false,Default,IndexingDict(TsIdentSimple(x),TsTypeRef(TsQIdent(List(TsIdentSimple(string))),List())),false,TsTypeRef(TsQIdent(List(TsIdentSimple(never))),List())))))),Left(TsIdentSimple(T))) */js.Any
  type Encodings = cypressLib.cypressLibStrings.ascii | cypressLib.cypressLibStrings.base64 | cypressLib.cypressLibStrings.binary | cypressLib.cypressLibStrings.hex | cypressLib.cypressLibStrings.latin1 | cypressLib.cypressLibStrings.utf8 | cypressLib.cypressLibStrings.`utf-8` | cypressLib.cypressLibStrings.ucs2 | cypressLib.cypressLibStrings.`ucs-2` | cypressLib.cypressLibStrings.utf16le | cypressLib.cypressLibStrings.`utf-16le`
  type FileContents = java.lang.String | js.Array[js.Any] | js.Object
  type HistoryDirection = cypressLib.cypressLibStrings.back | cypressLib.cypressLibStrings.forward
  type HttpMethod = cypressLib.cypressLibStrings.GET | cypressLib.cypressLibStrings.POST | cypressLib.cypressLibStrings.PUT | cypressLib.cypressLibStrings.DELETE | cypressLib.cypressLibStrings.OPTIONS | cypressLib.cypressLibStrings.HEAD | cypressLib.cypressLibStrings.TRACE | cypressLib.cypressLibStrings.CONNECT | cypressLib.cypressLibStrings.PATCH
  // @ts-ignore TODO - remove this if possible. Seems a recent change to TypeScript broke this. Possibly https://github.com/Microsoft/TypeScript/pull/17912
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, Diff[java.lang.String, K]]
  type PositionType = cypressLib.cypressLibStrings.topLeft | cypressLib.cypressLibStrings.top | cypressLib.cypressLibStrings.topRight | cypressLib.cypressLibStrings.left | cypressLib.cypressLibStrings.center | cypressLib.cypressLibStrings.right | cypressLib.cypressLibStrings.bottomLeft | cypressLib.cypressLibStrings.bottom | cypressLib.cypressLibStrings.bottomRight
  type PrevSubject = cypressLib.cypressLibStrings.optional | cypressLib.cypressLibStrings.element | cypressLib.cypressLibStrings.document | cypressLib.cypressLibStrings.window
  type RequestBody = java.lang.String | js.Object
  type ViewportOrientation = cypressLib.cypressLibStrings.portrait | cypressLib.cypressLibStrings.landscape
  type ViewportPreset = cypressLib.cypressLibStrings.`macbook-15` | cypressLib.cypressLibStrings.`macbook-13` | cypressLib.cypressLibStrings.`macbook-11` | cypressLib.cypressLibStrings.`ipad-2` | cypressLib.cypressLibStrings.`ipad-mini` | cypressLib.cypressLibStrings.`iphone-6+` | cypressLib.cypressLibStrings.`iphone-6` | cypressLib.cypressLibStrings.`iphone-5` | cypressLib.cypressLibStrings.`iphone-4` | cypressLib.cypressLibStrings.`iphone-3`
}
