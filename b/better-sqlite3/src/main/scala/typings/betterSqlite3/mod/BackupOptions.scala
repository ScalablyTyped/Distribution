package typings.betterSqlite3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupOptions extends StObject {
  
  def progress(info: BackupMetadata): Double
}
object BackupOptions {
  
  inline def apply(progress: BackupMetadata => Double): BackupOptions = {
    val __obj = js.Dynamic.literal(progress = js.Any.fromFunction1(progress))
    __obj.asInstanceOf[BackupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackupOptions] (val x: Self) extends AnyVal {
    
    inline def setProgress(value: BackupMetadata => Double): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
  }
}
