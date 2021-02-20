package typings.deprecatedDecorator

import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default(): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default(alternative: js.UndefOr[scala.Nothing], version: js.UndefOr[scala.Nothing], url: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default(alternative: js.UndefOr[scala.Nothing], version: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default(alternative: js.UndefOr[scala.Nothing], version: String, url: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default(alternative: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default(alternative: String, version: js.UndefOr[scala.Nothing], url: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default(alternative: String, version: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default(alternative: String, version: String, url: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default(options: DeprecatedOptions): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default[T /* <: js.Function */](alternative: String, fn: T): T = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default[T /* <: js.Function */](alternative: String, version: String, fn: T): T = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default[T /* <: js.Function */](alternative: String, version: String, url: String, fn: T): T = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default[T /* <: js.Function */](fn: T): T = js.native
  @JSImport("deprecated-decorator", JSImport.Default)
  @js.native
  def default[T /* <: js.Function */](options: DeprecatedOptions, fn: T): T = js.native
  
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated(): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated(alternative: js.UndefOr[scala.Nothing], version: js.UndefOr[scala.Nothing], url: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated(alternative: js.UndefOr[scala.Nothing], version: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated(alternative: js.UndefOr[scala.Nothing], version: String, url: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated(alternative: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated(alternative: String, version: js.UndefOr[scala.Nothing], url: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated(alternative: String, version: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated(alternative: String, version: String, url: String): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated(options: DeprecatedOptions): DeprecatedDecorator = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated[T /* <: js.Function */](alternative: String, fn: T): T = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated[T /* <: js.Function */](alternative: String, version: String, fn: T): T = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated[T /* <: js.Function */](alternative: String, version: String, url: String, fn: T): T = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated[T /* <: js.Function */](fn: T): T = js.native
  @JSImport("deprecated-decorator", "deprecated")
  @js.native
  def deprecated[T /* <: js.Function */](options: DeprecatedOptions, fn: T): T = js.native
  
  type DeprecatedDecorator = ClassDecorator with PropertyDecorator
  
  @js.native
  trait DeprecatedOptions extends StObject {
    
    var alternative: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object DeprecatedOptions {
    
    @scala.inline
    def apply(): DeprecatedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecatedOptions]
    }
    
    @scala.inline
    implicit class DeprecatedOptionsMutableBuilder[Self <: DeprecatedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternative(value: String): Self = StObject.set(x, "alternative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternativeUndefined: Self = StObject.set(x, "alternative", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
