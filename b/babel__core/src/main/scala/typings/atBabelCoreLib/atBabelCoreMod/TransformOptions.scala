package typings
package atBabelCoreLib.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends js.Object {
  /**
    * Include the AST in the returned object
    *
    * Default: `false`
    */
  var ast: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Attach a comment after all non-user injected code
    *
    * Default: `null`
    */
  var auxiliaryCommentAfter: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Attach a comment before all non-user injected code
    *
    * Default: `null`
    */
  var auxiliaryCommentBefore: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Specify whether or not to use .babelrc and
    * .babelignore files.
    *
    * Default: `true`
    */
  var babelrc: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Specify which packages should be search for .babelrc files when they are being compiled. `true` to always search, or a path string or an array of paths to packages to search
    * inside of. Defaults to only searching the "root" package.
    *
    * Default: `(root)`
    */
  var babelrcRoots: js.UndefOr[
    atBabelCoreLib.atBabelCoreLibNumbers.`true` | java.lang.String | js.Array[java.lang.String] | scala.Null
  ] = js.undefined
  /**
    * Enable code generation
    *
    * Default: `true`
    */
  var code: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Output comments in generated output
    *
    * Default: `true`
    */
  var comments: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Do not include superfluous whitespace characters and line terminators. When set to `"auto"` compact is set to `true` on input sizes of >500KB
    *
    * Default: `"auto"`
    */
  var compact: js.UndefOr[scala.Boolean | atBabelCoreLib.atBabelCoreLibStrings.auto | scala.Null] = js.undefined
  /**
    * The config file to load Babel's config from. Defaults to searching for "babel.config.js" inside the "root" folder. `false` will disable searching for config files.
    *
    * Default: `undefined`
    */
  var configFile: js.UndefOr[java.lang.String | atBabelCoreLib.atBabelCoreLibNumbers.`false` | scala.Null] = js.undefined
  /**
    * The working directory that Babel's programmatic options are loaded relative to.
    *
    * Default: `"."`
    */
  var cwd: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * This is an object of keys that represent different environments. For example, you may have: `{ env: { production: { \/ * specific options *\/ } } }`
    * which will use those options when the `envName` is `production`
    *
    * Default: `{}`
    */
  var env: js.UndefOr[
    (org.scalablytyped.runtime.StringDictionary[js.UndefOr[TransformOptions | scala.Null]]) | scala.Null
  ] = js.undefined
  /**
    * Defaults to environment variable `BABEL_ENV` if set, or else `NODE_ENV` if set, or else it defaults to `"development"`
    *
    * Default: env vars
    */
  var envName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * A path to a `.babelrc` file to extend
    *
    * Default: `null`
    */
  var `extends`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Filename for use in errors etc
    *
    * Default: `"unknown"`
    */
  var filename: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Filename relative to `sourceRoot`
    *
    * Default: `(filename)`
    */
  var filenameRelative: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * An object containing the options to be passed down to the babel code generator, @babel/generator
    *
    * Default: `{}`
    */
  var generatorOpts: js.UndefOr[atBabelGeneratorLib.atBabelGeneratorMod.GeneratorOptions | scala.Null] = js.undefined
  /**
    * Specify a custom callback to generate a module id with. Called as `getModuleId(moduleName)`. If falsy value is returned then the generated module id is used
    *
    * Default: `null`
    */
  var getModuleId: js.UndefOr[
    (js.Function1[/* moduleName */ java.lang.String, js.UndefOr[java.lang.String | scala.Null]]) | scala.Null
  ] = js.undefined
  /**
    * ANSI highlight syntax error code frames
    *
    * Default: `true`
    */
  var highlightCode: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Opposite to the `only` option. `ignore` is disregarded if `only` is specified
    *
    * Default: `null`
    */
  var ignore: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
    * A source map object that the output source map will be based on
    *
    * Default: `null`
    */
  var inputSourceMap: js.UndefOr[js.Object | scala.Null] = js.undefined
  /**
    * Should the output be minified (not printing last semicolons in blocks, printing literal string values instead of escaped ones, stripping `()` from `new` when safe)
    *
    * Default: `false`
    */
  var minified: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Specify a custom name for module ids
    *
    * Default: `null`
    */
  var moduleId: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * If truthy, insert an explicit id for modules. By default, all modules are anonymous. (Not available for `common` modules)
    *
    * Default: `false`
    */
  var moduleIds: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Optional prefix for the AMD module formatter that will be prepend to the filename on module definitions
    *
    * Default: `(sourceRoot)`
    */
  var moduleRoot: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * A glob, regex, or mixed array of both, matching paths to **only** compile. Can also be an array of arrays containing paths to explicitly match. When attempting to compile
    * a non-matching file it's returned verbatim
    *
    * Default: `null`
    */
  var only: js.UndefOr[
    java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) | scala.Null
  ] = js.undefined
  /**
    * An object containing the options to be passed down to the babel parser, @babel/parser
    *
    * Default: `{}`
    */
  var parserOpts: js.UndefOr[atBabelParserLib.atBabelParserMod.ParserOptions | scala.Null] = js.undefined
  /**
    * List of plugins to load and use
    *
    * Default: `[]`
    */
  var plugins: js.UndefOr[js.Array[PluginItem] | scala.Null] = js.undefined
  /**
    * List of presets (a set of plugins) to load and use
    *
    * Default: `[]`
    */
  var presets: js.UndefOr[js.Array[PluginItem] | scala.Null] = js.undefined
  /**
    * Retain line numbers. This will lead to wacky code but is handy for scenarios where you can't use source maps. (**NOTE**: This will not retain the columns)
    *
    * Default: `false`
    */
  var retainLines: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Specify the "root" folder that defines the location to search for "babel.config.js", and the default folder to allow `.babelrc` files inside of.
    *
    * Default: `"."`
    */
  var root: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * An optional callback that controls whether a comment should be output or not. Called as `shouldPrintComment(commentContents)`. **NOTE**: This overrides the `comment` option when used
    *
    * Default: `null`
    */
  var shouldPrintComment: js.UndefOr[
    (js.Function1[/* commentContents */ java.lang.String, scala.Boolean]) | scala.Null
  ] = js.undefined
  /**
    * Set `sources[0]` on returned source map
    *
    * Default: `(filenameRelative)`
    */
  var sourceFileName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * If truthy, adds a `map` property to returned output. If set to `"inline"`, a comment with a sourceMappingURL directive is added to the bottom of the returned code. If set to `"both"`
    * then a `map` property is returned as well as a source map comment appended. **This does not emit sourcemap files by itself!**
    *
    * Default: `false`
    */
  var sourceMaps: js.UndefOr[
    scala.Boolean | atBabelCoreLib.atBabelCoreLibStrings.`inline` | atBabelCoreLib.atBabelCoreLibStrings.both | scala.Null
  ] = js.undefined
  /**
    * The root from which all sources are relative
    *
    * Default: `(moduleRoot)`
    */
  var sourceRoot: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Indicate the mode the code should be parsed in. Can be one of "script", "module", or "unambiguous". `"unambiguous"` will make Babel attempt to guess, based on the presence of ES6
    * `import` or `export` statements. Files with ES6 `import`s and `export`s are considered `"module"` and are otherwise `"script"`.
    *
    * Default: `("module")`
    */
  var sourceType: js.UndefOr[
    atBabelCoreLib.atBabelCoreLibStrings.script | atBabelCoreLib.atBabelCoreLibStrings.module | atBabelCoreLib.atBabelCoreLibStrings.unambiguous | scala.Null
  ] = js.undefined
  /**
    * An optional callback that can be used to wrap visitor methods. **NOTE**: This is useful for things like introspection, and not really needed for implementing anything. Called as
    * `wrapPluginVisitorMethod(pluginAlias, visitorType, callback)`.
    */
  var wrapPluginVisitorMethod: js.UndefOr[
    (js.Function3[
      /* pluginAlias */ java.lang.String, 
      /* visitorType */ atBabelCoreLib.atBabelCoreLibStrings.enter | atBabelCoreLib.atBabelCoreLibStrings.exit, 
      /* callback */ js.Function2[
        /* path */ atBabelTraverseLib.atBabelTraverseMod.NodePath[atBabelTraverseLib.atBabelTraverseMod.Node], 
        /* state */ js.Any, 
        scala.Unit
      ], 
      js.Function2[
        /* path */ atBabelTraverseLib.atBabelTraverseMod.NodePath[atBabelTraverseLib.atBabelTraverseMod.Node], 
        /* state */ _, 
        scala.Unit
      ]
    ]) | scala.Null
  ] = js.undefined
}

