package typings.cucumberCucumber.libApiTypesMod

import typings.cucumberCucumber.cucumberCucumberBooleans.`false`
import typings.cucumberCucumber.libFormatterMod.FormatOptions
import typings.cucumberCucumber.libFormatterMod.IPublishConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRunOptionsFormats extends StObject {
  
  var files: Record[String, String]
  
  var options: FormatOptions
  
  var publish: IPublishConfig | `false`
  
  var stdout: String
}
object IRunOptionsFormats {
  
  inline def apply(
    files: Record[String, String],
    options: FormatOptions,
    publish: IPublishConfig | `false`,
    stdout: String
  ): IRunOptionsFormats = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], publish = publish.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRunOptionsFormats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRunOptionsFormats] (val x: Self) extends AnyVal {
    
    inline def setFiles(value: Record[String, String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: FormatOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPublish(value: IPublishConfig | `false`): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
    
    inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
