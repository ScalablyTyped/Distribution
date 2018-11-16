package typings
package atBabelGeneratorLib.generatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GeneratorOptions extends js.Object {
  /**
       * Optional string to add as a block comment at the end of the output file.
       */
  var auxiliaryCommentAfter: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional string to add as a block comment at the start of the output file.
       */
  var auxiliaryCommentBefore: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Should comments be included in output? Defaults to `true`.
       */
  var comments: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Set to true to avoid adding whitespace for formatting. Defaults to the value of `opts.minified`.
       */
  var compact: js.UndefOr[scala.Boolean | atBabelGeneratorLib.atBabelGeneratorLibStrings.auto] = js.undefined
  /**
       * Set to true to reduce whitespace (but not as much as opts.compact). Defaults to `false`.
       */
  var concise: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Used in warning messages
       */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Set to true to run jsesc with "json": true to print "\\u00A9" vs. "©";
       */
  var jsonCompatibleStrings: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Should the output be minified. Defaults to `false`.
       */
  var minified: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The type of quote to use in the output. If omitted, autodetects based on `ast.tokens`.
       */
  var quotes: js.UndefOr[
    atBabelGeneratorLib.atBabelGeneratorLibStrings.single | atBabelGeneratorLib.atBabelGeneratorLibStrings.double
  ] = js.undefined
  /**
       * Attempt to use the same line numbers in the output code as in the source code (helps preserve stack traces).
       * Defaults to `false`.
       */
  var retainLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Function that takes a comment (as a string) and returns true if the comment should be included in the output.
       * By default, comments are included if `opts.comments` is `true` or if `opts.minifed` is `false` and the comment
       * contains `@preserve` or `@license`.
       */
  var shouldPrintComment: js.UndefOr[js.Function1[/* comment */ java.lang.String, scala.Boolean]] = js.undefined
  /**
       * The filename for the source code (i.e. the code in the `code` argument).
       * This will only be used if `code` is a string.
       */
  var sourceFileName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The filename of the generated code that the source map will be associated with.
       */
  var sourceMapTarget: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Enable generating source maps. Defaults to `false`.
       */
  var sourceMaps: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A root for all relative URLs in the source map.
       */
  var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
}

