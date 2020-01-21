package typings.caseless

import typings.caseless.caselessBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("caseless", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Caseless extends js.Object {
    def del(name: KeyType): Boolean = js.native
    def get(name: KeyType): js.UndefOr[ValueType] = js.native
    def has(name: KeyType): KeyType | `false` = js.native
    def set(dict: RawDict): Unit = js.native
    def set(name: KeyType, value: ValueType): KeyType | `false` = js.native
    def set(name: KeyType, value: ValueType, clobber: Boolean): KeyType | `false` = js.native
    def swap(name: KeyType): Unit = js.native
  }
  
  @js.native
  trait Httpified extends js.Object {
    var headers: RawDict = js.native
    def getHeader(name: KeyType): js.UndefOr[ValueType] = js.native
    def hasHeader(name: KeyType): KeyType | `false` = js.native
    def removeHeader(name: KeyType): Boolean = js.native
    def setHeader(dict: RawDict): Unit = js.native
    def setHeader(name: KeyType, value: ValueType): KeyType | `false` = js.native
    def setHeader(name: KeyType, value: ValueType, clobber: Boolean): KeyType | `false` = js.native
  }
  
  def apply(): Caseless = js.native
  def apply(dict: RawDict): Caseless = js.native
  def httpify(resp: js.Object, headers: RawDict): Caseless = js.native
  type KeyType = String
  type RawDict = js.Object
  type ValueType = js.Any
}

