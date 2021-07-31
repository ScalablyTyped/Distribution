package typings.caseless

import typings.caseless.caselessBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Caseless = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Caseless]
  @scala.inline
  def apply(dict: RawDict): Caseless = ^.asInstanceOf[js.Dynamic].apply(dict.asInstanceOf[js.Any]).asInstanceOf[Caseless]
  
  @JSImport("caseless", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def httpify(resp: js.Object, headers: RawDict): Caseless = (^.asInstanceOf[js.Dynamic].applyDynamic("httpify")(resp.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Caseless]
  
  @js.native
  trait Caseless extends StObject {
    
    def del(name: KeyType): Boolean = js.native
    
    def get(name: KeyType): js.UndefOr[ValueType] = js.native
    
    def has(name: KeyType): KeyType | `false` = js.native
    
    def set(dict: RawDict): Unit = js.native
    def set(name: KeyType, value: ValueType): KeyType | `false` = js.native
    def set(name: KeyType, value: ValueType, clobber: Boolean): KeyType | `false` = js.native
    
    def swap(name: KeyType): Unit = js.native
  }
  
  @js.native
  trait Httpified extends StObject {
    
    def getHeader(name: KeyType): js.UndefOr[ValueType] = js.native
    
    def hasHeader(name: KeyType): KeyType | `false` = js.native
    
    var headers: RawDict = js.native
    
    def removeHeader(name: KeyType): Boolean = js.native
    
    def setHeader(dict: RawDict): Unit = js.native
    def setHeader(name: KeyType, value: ValueType): KeyType | `false` = js.native
    def setHeader(name: KeyType, value: ValueType, clobber: Boolean): KeyType | `false` = js.native
  }
  
  type KeyType = String
  
  type RawDict = js.Object
  
  type ValueType = js.Any
}
