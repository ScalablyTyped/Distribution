package typings.uvu1yNNGH0U

import typings.uvu1yNNGH0U.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDDotTsMod {
  
  @JSImport(".uvu-1yNNGH0U/parse/index.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(): js.Promise[Argv] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[js.Promise[Argv]]
  inline def parse(dir: String): js.Promise[Argv] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Argv]]
  inline def parse(dir: String, pattern: String): js.Promise[Argv] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Argv]]
  inline def parse(dir: String, pattern: String, opts: PartialOptions): js.Promise[Argv] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Argv]]
  inline def parse(dir: String, pattern: js.RegExp): js.Promise[Argv] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Argv]]
  inline def parse(dir: String, pattern: js.RegExp, opts: PartialOptions): js.Promise[Argv] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Argv]]
  inline def parse(dir: String, pattern: Unit, opts: PartialOptions): js.Promise[Argv] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Argv]]
  inline def parse(dir: Unit, pattern: String): js.Promise[Argv] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Argv]]
  inline def parse(dir: Unit, pattern: String, opts: PartialOptions): js.Promise[Argv] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Argv]]
  inline def parse(dir: Unit, pattern: js.RegExp): js.Promise[Argv] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Argv]]
  inline def parse(dir: Unit, pattern: js.RegExp, opts: PartialOptions): js.Promise[Argv] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Argv]]
  inline def parse(dir: Unit, pattern: Unit, opts: PartialOptions): js.Promise[Argv] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Argv]]
  
  trait Argv extends StObject {
    
    var dir: String
    
    var requires: Boolean
    
    var suites: js.Array[Suite]
  }
  object Argv {
    
    inline def apply(dir: String, requires: Boolean, suites: js.Array[Suite]): Argv = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], requires = requires.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setRequires(value: Boolean): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      inline def setSuites(value: js.Array[Suite]): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
      
      inline def setSuitesVarargs(value: Suite*): Self = StObject.set(x, "suites", js.Array(value*))
    }
  }
  
  type Arrayable[T] = js.Array[T] | T
  
  trait Options extends StObject {
    
    var cwd: String
    
    var ignore: Arrayable[String | js.RegExp]
    
    var require: Arrayable[String]
  }
  object Options {
    
    inline def apply(cwd: String, ignore: Arrayable[String | js.RegExp], require: Arrayable[String]): Options = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setIgnore(value: Arrayable[String | js.RegExp]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setRequire(value: Arrayable[String]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireVarargs(value: String*): Self = StObject.set(x, "require", js.Array(value*))
    }
  }
  
  trait Suite extends StObject {
    
    /** The absolute file path */
    var file: String
    
    /** The relative file path */
    var name: String
  }
  object Suite {
    
    inline def apply(file: String, name: String): Suite = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suite]
    }
    
    extension [Self <: Suite](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
