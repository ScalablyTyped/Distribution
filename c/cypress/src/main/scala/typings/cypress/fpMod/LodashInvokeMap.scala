package typings.cypress.fpMod

import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashInvokeMap extends js.Object {
  def apply(methodNameOrMethod: __): LodashInvokeMap1x2 = js.native
  def apply(methodNameOrMethod: __, collection: js.Object): LodashInvokeMap1x2 = js.native
  def apply(methodName: String): LodashInvokeMap1x1 = js.native
  def apply(methodName: String, collection: js.Object): js.Array[_] = js.native
  def apply[TResult](method: js.Function1[/* repeated */ js.Any, TResult]): LodashInvokeMap2x1[TResult] = js.native
  def apply[TResult](method: js.Function1[/* repeated */ js.Any, TResult], collection: js.Object): js.Array[TResult] = js.native
}

