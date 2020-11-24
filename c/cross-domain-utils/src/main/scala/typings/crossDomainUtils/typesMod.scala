package typings.crossDomainUtils

import org.scalablytyped.runtime.Instantiable0
import typings.crossDomainUtils.anon.Instantiable
import typings.crossDomainUtils.anon.MockUserAgent
import typings.std.Document
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cross-domain-utils/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  
  val TYPES: /* true */ Boolean = js.native
  
  @js.native
  trait CrossDomainWindowType extends js.Object {
    
    def close(): Unit = js.native
    
    var closed: Boolean = js.native
    
    def focus(): Unit = js.native
    
    var frames: js.Array[CrossDomainWindowType] | CrossDomainWindowType = js.native
    
    var length: Double = js.native
    
    var location: String | js.Object = js.native
    
    def open(): CrossDomainWindowType | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: js.UndefOr[scala.Nothing], features: String): CrossDomainWindowType | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: String): CrossDomainWindowType | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: String, features: String): CrossDomainWindowType | Null = js.native
    def open(url: String): CrossDomainWindowType | Null = js.native
    def open(url: String, target: js.UndefOr[scala.Nothing], features: String): CrossDomainWindowType | Null = js.native
    def open(url: String, target: String): CrossDomainWindowType | Null = js.native
    def open(url: String, target: String, features: String): CrossDomainWindowType | Null = js.native
    
    var opener: js.UndefOr[CrossDomainWindowType] = js.native
    
    var parent: CrossDomainWindowType = js.native
    
    def postMessage(a: String, b: String): Unit = js.native
    
    var self: CrossDomainWindowType = js.native
    
    var top: CrossDomainWindowType = js.native
  }
  
  @js.native
  trait SameDomainWindowType extends js.Object {
    
    var XMLHttpRequest: js.UndefOr[Instantiable with Instantiable0[typings.std.global.XMLHttpRequest]] = js.native
    
    def close(): Unit = js.native
    
    var closed: Boolean = js.native
    
    var document: Document = js.native
    
    def focus(): Unit = js.native
    
    var location: String | js.Object = js.native
    
    var navigator: MockUserAgent = js.native
    
    def open(): CrossDomainWindowType | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: js.UndefOr[scala.Nothing], features: String): CrossDomainWindowType | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: String): CrossDomainWindowType | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: String, features: String): CrossDomainWindowType | Null = js.native
    def open(url: String): CrossDomainWindowType | Null = js.native
    def open(url: String, target: js.UndefOr[scala.Nothing], features: String): CrossDomainWindowType | Null = js.native
    def open(url: String, target: String): CrossDomainWindowType | Null = js.native
    def open(url: String, target: String, features: String): CrossDomainWindowType | Null = js.native
    
    var self: CrossDomainWindowType = js.native
  }
  
  type DomainMatcher = String | js.Array[String] | RegExp
}
