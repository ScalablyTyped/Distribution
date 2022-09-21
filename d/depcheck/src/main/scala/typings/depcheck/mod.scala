package typings.depcheck

import org.scalablytyped.runtime.StringDictionary
import typings.depcheck.anon.Dependencies
import typings.depcheck.depcheckStrings.`feross-standard`
import typings.depcheck.depcheckStrings.`gulp-load-plugins`
import typings.depcheck.depcheckStrings.`lint-staged`
import typings.depcheck.depcheckStrings.babel
import typings.depcheck.depcheckStrings.bin
import typings.depcheck.depcheckStrings.coffee
import typings.depcheck.depcheckStrings.commitizen
import typings.depcheck.depcheckStrings.es6
import typings.depcheck.depcheckStrings.es7
import typings.depcheck.depcheckStrings.eslint
import typings.depcheck.depcheckStrings.exportDeclaration
import typings.depcheck.depcheckStrings.expressViewEngine
import typings.depcheck.depcheckStrings.extract
import typings.depcheck.depcheckStrings.gatsby
import typings.depcheck.depcheckStrings.gruntLoadTaskCallExpression
import typings.depcheck.depcheckStrings.husky
import typings.depcheck.depcheckStrings.importCallExpression
import typings.depcheck.depcheckStrings.importDeclaration
import typings.depcheck.depcheckStrings.istanbul
import typings.depcheck.depcheckStrings.jest
import typings.depcheck.depcheckStrings.jsx
import typings.depcheck.depcheckStrings.karma
import typings.depcheck.depcheckStrings.mocha
import typings.depcheck.depcheckStrings.prettier
import typings.depcheck.depcheckStrings.react17
import typings.depcheck.depcheckStrings.requireCallExpression
import typings.depcheck.depcheckStrings.requireResolveCallExpression
import typings.depcheck.depcheckStrings.sass
import typings.depcheck.depcheckStrings.serverless
import typings.depcheck.depcheckStrings.svelte
import typings.depcheck.depcheckStrings.tslint
import typings.depcheck.depcheckStrings.ttypescript
import typings.depcheck.depcheckStrings.typescript
import typings.depcheck.depcheckStrings.typescriptImportEqualsDeclaration
import typings.depcheck.depcheckStrings.typescriptImportType
import typings.depcheck.depcheckStrings.vue
import typings.depcheck.depcheckStrings.webpack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(rootDir: String, options: Options): js.Promise[Results] = (^.asInstanceOf[js.Dynamic].apply(rootDir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Results]]
  inline def apply[T](rootDir: String, options: Options, callback: js.Function1[/* results */ Results, T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(rootDir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("depcheck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object detector {
    
    @JSImport("depcheck", "detector")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("depcheck", "detector.exportDeclaration")
    @js.native
    def exportDeclaration: Detector_ = js.native
    inline def exportDeclaration(node: Node): js.Array[String] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("exportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | String]
    inline def exportDeclaration_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exportDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.expressViewEngine")
    @js.native
    def expressViewEngine: Detector_ = js.native
    inline def expressViewEngine(node: Node): js.Array[String] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("expressViewEngine")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | String]
    inline def expressViewEngine_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expressViewEngine")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.extract")
    @js.native
    def extract: Detector_ = js.native
    inline def extract(node: Node): js.Array[String] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | String]
    inline def extract_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extract")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.gruntLoadTaskCallExpression")
    @js.native
    def gruntLoadTaskCallExpression: Detector_ = js.native
    inline def gruntLoadTaskCallExpression(node: Node): js.Array[String] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("gruntLoadTaskCallExpression")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | String]
    inline def gruntLoadTaskCallExpression_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gruntLoadTaskCallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.importCallExpression")
    @js.native
    def importCallExpression: Detector_ = js.native
    inline def importCallExpression(node: Node): js.Array[String] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("importCallExpression")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | String]
    inline def importCallExpression_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importCallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.importDeclaration")
    @js.native
    def importDeclaration: Detector_ = js.native
    inline def importDeclaration(node: Node): js.Array[String] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("importDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | String]
    inline def importDeclaration_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.requireCallExpression")
    @js.native
    def requireCallExpression: Detector_ = js.native
    inline def requireCallExpression(node: Node): js.Array[String] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("requireCallExpression")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | String]
    inline def requireCallExpression_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requireCallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.requireResolveCallExpression")
    @js.native
    def requireResolveCallExpression: Detector_ = js.native
    inline def requireResolveCallExpression(node: Node): js.Array[String] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("requireResolveCallExpression")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | String]
    inline def requireResolveCallExpression_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requireResolveCallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.typescriptImportEqualsDeclaration")
    @js.native
    def typescriptImportEqualsDeclaration: Detector_ = js.native
    inline def typescriptImportEqualsDeclaration(node: Node): js.Array[String] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("typescriptImportEqualsDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | String]
    inline def typescriptImportEqualsDeclaration_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typescriptImportEqualsDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "detector.typescriptImportType")
    @js.native
    def typescriptImportType: Detector_ = js.native
    inline def typescriptImportType(node: Node): js.Array[String] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("typescriptImportType")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | String]
    inline def typescriptImportType_=(x: Detector_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typescriptImportType")(x.asInstanceOf[js.Any])
  }
  
  object parser {
    
    @JSImport("depcheck", "parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("depcheck", "parser.coffee")
    @js.native
    def coffee: Parser_ = js.native
    inline def coffee(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("coffee")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def coffee_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coffee")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.es6")
    @js.native
    def es6: Parser_ = js.native
    inline def es6(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("es6")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def es6_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("es6")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.es7")
    @js.native
    def es7: Parser_ = js.native
    inline def es7(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("es7")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def es7_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("es7")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.jsx")
    @js.native
    def jsx: Parser_ = js.native
    inline def jsx(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def jsx_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jsx")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.sass")
    @js.native
    def sass: Parser_ = js.native
    inline def sass(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("sass")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def sass_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sass")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.svelte")
    @js.native
    def svelte: Parser_ = js.native
    inline def svelte(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("svelte")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def svelte_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svelte")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.typescript")
    @js.native
    def typescript: Parser_ = js.native
    inline def typescript(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("typescript")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def typescript_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typescript")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "parser.vue")
    @js.native
    def vue: Parser_ = js.native
    inline def vue(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("vue")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def vue_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vue")(x.asInstanceOf[js.Any])
  }
  
  object special {
    
    @JSImport("depcheck", "special")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("depcheck", "special.babel")
    @js.native
    def babel: Parser_ = js.native
    inline def babel(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("babel")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def babel_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("babel")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.bin")
    @js.native
    def bin: Parser_ = js.native
    inline def bin(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("bin")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def bin_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bin")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.commitizen")
    @js.native
    def commitizen: Parser_ = js.native
    inline def commitizen(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("commitizen")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def commitizen_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("commitizen")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.eslint")
    @js.native
    def eslint: Parser_ = js.native
    inline def eslint(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("eslint")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def eslint_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eslint")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.feross-standard")
    @js.native
    def ferossStandard: Parser_ = js.native
    
    inline def ferossStandard(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("feross-standard")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def ferossStandard_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feross-standard")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.gatsby")
    @js.native
    def gatsby: Parser_ = js.native
    inline def gatsby(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("gatsby")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def gatsby_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gatsby")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.gulp-load-plugins")
    @js.native
    def gulpLoadPlugins: Parser_ = js.native
    
    inline def gulpLoadPlugins(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("gulp-load-plugins")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def gulpLoadPlugins_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gulp-load-plugins")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.husky")
    @js.native
    def husky: Parser_ = js.native
    inline def husky(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("husky")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def husky_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("husky")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.istanbul")
    @js.native
    def istanbul: Parser_ = js.native
    inline def istanbul(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("istanbul")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def istanbul_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("istanbul")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.jest")
    @js.native
    def jest: Parser_ = js.native
    inline def jest(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("jest")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def jest_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jest")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.karma")
    @js.native
    def karma: Parser_ = js.native
    inline def karma(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("karma")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def karma_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("karma")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.lint-staged")
    @js.native
    def lintStaged: Parser_ = js.native
    
    inline def lintStaged(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("lint-staged")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def lintStaged_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lint-staged")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.mocha")
    @js.native
    def mocha: Parser_ = js.native
    inline def mocha(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("mocha")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def mocha_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mocha")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.prettier")
    @js.native
    def prettier: Parser_ = js.native
    inline def prettier(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("prettier")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def prettier_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prettier")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.react17")
    @js.native
    def react17: Parser_ = js.native
    inline def react17(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("react17")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def react17_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("react17")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.serverless")
    @js.native
    def serverless: Parser_ = js.native
    inline def serverless(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("serverless")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def serverless_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverless")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.tslint")
    @js.native
    def tslint: Parser_ = js.native
    inline def tslint(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("tslint")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def tslint_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tslint")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.ttypescript")
    @js.native
    def ttypescript: Parser_ = js.native
    inline def ttypescript(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("ttypescript")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def ttypescript_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ttypescript")(x.asInstanceOf[js.Any])
    
    @JSImport("depcheck", "special.webpack")
    @js.native
    def webpack: Parser_ = js.native
    inline def webpack(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("webpack")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Node]
    inline def webpack_=(x: Parser_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webpack")(x.asInstanceOf[js.Any])
  }
  
  trait Config extends StObject {
    
    var detectors: js.UndefOr[
        js.Array[
          /* keyof depcheck.anon.ExportDeclaration */ exportDeclaration | expressViewEngine | extract | gruntLoadTaskCallExpression | importCallExpression | importDeclaration | requireCallExpression | requireResolveCallExpression | typescriptImportEqualsDeclaration | typescriptImportType
        ]
      ] = js.undefined
    
    var ignoreBinPackage: js.UndefOr[Boolean] = js.undefined
    
    var ignoreDirs: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignorePath: js.UndefOr[String] = js.undefined
    
    var ignorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignores: js.UndefOr[js.Array[String]] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var parsers: js.UndefOr[
        StringDictionary[
          coffee | es6 | es7 | jsx | sass | svelte | typescript | vue | (js.Array[
            /* keyof depcheck.anon.Coffee */ coffee | es6 | es7 | jsx | sass | svelte | typescript | vue
          ])
        ]
      ] = js.undefined
    
    var skipMissing: js.UndefOr[Boolean] = js.undefined
    
    var specials: js.UndefOr[
        js.Array[
          /* keyof depcheck.anon.Babel */ babel | bin | commitizen | eslint | `feross-standard` | gatsby | `gulp-load-plugins` | husky | istanbul | jest | karma | `lint-staged` | mocha | prettier | react17 | serverless | tslint | ttypescript | webpack
        ]
      ] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setDetectors(
        value: js.Array[
              /* keyof depcheck.anon.ExportDeclaration */ exportDeclaration | expressViewEngine | extract | gruntLoadTaskCallExpression | importCallExpression | importDeclaration | requireCallExpression | requireResolveCallExpression | typescriptImportEqualsDeclaration | typescriptImportType
            ]
      ): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
      
      inline def setDetectorsUndefined: Self = StObject.set(x, "detectors", js.undefined)
      
      inline def setDetectorsVarargs(
        value: (/* keyof depcheck.anon.ExportDeclaration */ exportDeclaration | expressViewEngine | extract | gruntLoadTaskCallExpression | importCallExpression | importDeclaration | requireCallExpression | requireResolveCallExpression | typescriptImportEqualsDeclaration | typescriptImportType)*
      ): Self = StObject.set(x, "detectors", js.Array(value*))
      
      inline def setIgnoreBinPackage(value: Boolean): Self = StObject.set(x, "ignoreBinPackage", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBinPackageUndefined: Self = StObject.set(x, "ignoreBinPackage", js.undefined)
      
      inline def setIgnoreDirs(value: js.Array[String]): Self = StObject.set(x, "ignoreDirs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDirsUndefined: Self = StObject.set(x, "ignoreDirs", js.undefined)
      
      inline def setIgnoreDirsVarargs(value: String*): Self = StObject.set(x, "ignoreDirs", js.Array(value*))
      
      inline def setIgnorePath(value: String): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      inline def setIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "ignorePatterns", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternsUndefined: Self = StObject.set(x, "ignorePatterns", js.undefined)
      
      inline def setIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "ignorePatterns", js.Array(value*))
      
      inline def setIgnores(value: js.Array[String]): Self = StObject.set(x, "ignores", value.asInstanceOf[js.Any])
      
      inline def setIgnoresUndefined: Self = StObject.set(x, "ignores", js.undefined)
      
      inline def setIgnoresVarargs(value: String*): Self = StObject.set(x, "ignores", js.Array(value*))
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setParsers(
        value: StringDictionary[
              coffee | es6 | es7 | jsx | sass | svelte | typescript | vue | (js.Array[
                /* keyof depcheck.anon.Coffee */ coffee | es6 | es7 | jsx | sass | svelte | typescript | vue
              ])
            ]
      ): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
      
      inline def setParsersUndefined: Self = StObject.set(x, "parsers", js.undefined)
      
      inline def setSkipMissing(value: Boolean): Self = StObject.set(x, "skipMissing", value.asInstanceOf[js.Any])
      
      inline def setSkipMissingUndefined: Self = StObject.set(x, "skipMissing", js.undefined)
      
      inline def setSpecials(
        value: js.Array[
              /* keyof depcheck.anon.Babel */ babel | bin | commitizen | eslint | `feross-standard` | gatsby | `gulp-load-plugins` | husky | istanbul | jest | karma | `lint-staged` | mocha | prettier | react17 | serverless | tslint | ttypescript | webpack
            ]
      ): Self = StObject.set(x, "specials", value.asInstanceOf[js.Any])
      
      inline def setSpecialsUndefined: Self = StObject.set(x, "specials", js.undefined)
      
      inline def setSpecialsVarargs(
        value: (/* keyof depcheck.anon.Babel */ babel | bin | commitizen | eslint | `feross-standard` | gatsby | `gulp-load-plugins` | husky | istanbul | jest | karma | `lint-staged` | mocha | prettier | react17 | serverless | tslint | ttypescript | webpack)*
      ): Self = StObject.set(x, "specials", js.Array(value*))
    }
  }
  
  type Detector_ = js.Function1[/* node */ Node, js.Array[String] | String]
  
  type Node = StringDictionary[Any]
  
  trait Options extends StObject {
    
    @JSName("package")
    var _package: js.UndefOr[Dependencies] = js.undefined
    
    var detectors: js.UndefOr[js.Array[Detector_]] = js.undefined
    
    var ignoreBinPackage: js.UndefOr[Boolean] = js.undefined
    
    var ignoreDirs: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreMatches: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignorePath: js.UndefOr[String] = js.undefined
    
    var ignorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var parsers: js.UndefOr[StringDictionary[Parser_]] = js.undefined
    
    var skipMissing: js.UndefOr[Boolean] = js.undefined
    
    var specials: js.UndefOr[js.Array[Parser_]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDetectors(value: js.Array[Detector_]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
      
      inline def setDetectorsUndefined: Self = StObject.set(x, "detectors", js.undefined)
      
      inline def setDetectorsVarargs(value: Detector_ *): Self = StObject.set(x, "detectors", js.Array(value*))
      
      inline def setIgnoreBinPackage(value: Boolean): Self = StObject.set(x, "ignoreBinPackage", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBinPackageUndefined: Self = StObject.set(x, "ignoreBinPackage", js.undefined)
      
      inline def setIgnoreDirs(value: js.Array[String]): Self = StObject.set(x, "ignoreDirs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDirsUndefined: Self = StObject.set(x, "ignoreDirs", js.undefined)
      
      inline def setIgnoreDirsVarargs(value: String*): Self = StObject.set(x, "ignoreDirs", js.Array(value*))
      
      inline def setIgnoreMatches(value: js.Array[String]): Self = StObject.set(x, "ignoreMatches", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMatchesUndefined: Self = StObject.set(x, "ignoreMatches", js.undefined)
      
      inline def setIgnoreMatchesVarargs(value: String*): Self = StObject.set(x, "ignoreMatches", js.Array(value*))
      
      inline def setIgnorePath(value: String): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      inline def setIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "ignorePatterns", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternsUndefined: Self = StObject.set(x, "ignorePatterns", js.undefined)
      
      inline def setIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "ignorePatterns", js.Array(value*))
      
      inline def setParsers(value: StringDictionary[Parser_]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
      
      inline def setParsersUndefined: Self = StObject.set(x, "parsers", js.undefined)
      
      inline def setSkipMissing(value: Boolean): Self = StObject.set(x, "skipMissing", value.asInstanceOf[js.Any])
      
      inline def setSkipMissingUndefined: Self = StObject.set(x, "skipMissing", js.undefined)
      
      inline def setSpecials(value: js.Array[Parser_]): Self = StObject.set(x, "specials", value.asInstanceOf[js.Any])
      
      inline def setSpecialsUndefined: Self = StObject.set(x, "specials", js.undefined)
      
      inline def setSpecialsVarargs(value: Parser_ *): Self = StObject.set(x, "specials", js.Array(value*))
      
      inline def set_package(value: Dependencies): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
  
  type PackageDependencies = StringDictionary[String]
  
  type Parser_ = js.Function4[
    /* content */ String, 
    /* filePath */ String, 
    /* deps */ js.Array[String], 
    /* rootDir */ String, 
    Node
  ]
  
  trait Results extends StObject {
    
    var dependencies: js.Array[String]
    
    var devDependencies: js.Array[String]
    
    var invalidDirs: StringDictionary[Any]
    
    var invalidFiles: StringDictionary[Any]
    
    var missing: StringDictionary[js.Array[String]]
    
    var `using`: StringDictionary[js.Array[String]]
  }
  object Results {
    
    inline def apply(
      dependencies: js.Array[String],
      devDependencies: js.Array[String],
      invalidDirs: StringDictionary[Any],
      invalidFiles: StringDictionary[Any],
      missing: StringDictionary[js.Array[String]],
      `using`: StringDictionary[js.Array[String]]
    ): Results = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any], invalidDirs = invalidDirs.asInstanceOf[js.Any], invalidFiles = invalidFiles.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any])
      __obj.updateDynamic("using")(`using`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setDevDependencies(value: js.Array[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesVarargs(value: String*): Self = StObject.set(x, "devDependencies", js.Array(value*))
      
      inline def setInvalidDirs(value: StringDictionary[Any]): Self = StObject.set(x, "invalidDirs", value.asInstanceOf[js.Any])
      
      inline def setInvalidFiles(value: StringDictionary[Any]): Self = StObject.set(x, "invalidFiles", value.asInstanceOf[js.Any])
      
      inline def setMissing(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      inline def setUsing(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
    }
  }
}
