package typings.depcheck.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Results extends js.Object {
  
  var dependencies: js.Array[String] = js.native
  
  var devDependencies: js.Array[String] = js.native
  
  var invalidDirs: StringDictionary[js.Any] = js.native
  
  var invalidFiles: StringDictionary[js.Any] = js.native
  
  var missing: StringDictionary[js.Array[String]] = js.native
  
  var using: StringDictionary[js.Array[String]] = js.native
}
object Results {
  
  @scala.inline
  def apply(
    dependencies: js.Array[String],
    devDependencies: js.Array[String],
    invalidDirs: StringDictionary[js.Any],
    invalidFiles: StringDictionary[js.Any],
    missing: StringDictionary[js.Array[String]],
    using: StringDictionary[js.Array[String]]
  ): Results = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any], invalidDirs = invalidDirs.asInstanceOf[js.Any], invalidFiles = invalidFiles.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevDependenciesVarargs(value: String*): Self = this.set("devDependencies", js.Array(value :_*))
    
    @scala.inline
    def setDevDependencies(value: js.Array[String]): Self = this.set("devDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidDirs(value: StringDictionary[js.Any]): Self = this.set("invalidDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidFiles(value: StringDictionary[js.Any]): Self = this.set("invalidFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissing(value: StringDictionary[js.Array[String]]): Self = this.set("missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsing(value: StringDictionary[js.Array[String]]): Self = this.set("using", value.asInstanceOf[js.Any])
  }
}
