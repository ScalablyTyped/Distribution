package typings
package cleanDashCssLib.cleanDashCssMod.CleanCSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  // Set to false to disable advanced optimizations - selector & property merging, reduction, etc.
  var advanced: js.UndefOr[scala.Boolean] = js.undefined
  // Set to false to disable aggressive merging of properties.
  var aggressiveMerging: js.UndefOr[scala.Boolean] = js.undefined
  // Turns on benchmarking mode measuring time spent on cleaning up (run npm run bench to see example)
  var benchmark: js.UndefOr[scala.Boolean] = js.undefined
  // Enables compatibility mode
  var compatibility: js.UndefOr[js.Object] = js.undefined
  // Set to true to get minification statistics under stats property (see test/custom-test.js for examples)
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  // A hash of options for @import inliner, see test/protocol-imports-test.js for examples, or this comment for a proxy use case.
  var inliner: js.UndefOr[js.Object] = js.undefined
  // Whether to keep line breaks (default is false)
  var keepBreaks: js.UndefOr[scala.Boolean] = js.undefined
  // * for keeping all (default), 1 for keeping first one only, 0 for removing all
  var keepSpecialComments: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  // Whether to merge @media at-rules (default is true)
  var mediaMerging: js.UndefOr[scala.Boolean] = js.undefined
  // Whether to process @import rules
  var processImport: js.UndefOr[scala.Boolean] = js.undefined
  // A list of @import rules, can be ['all'] (default), ['local'], ['remote'], or a blacklisted path e.g. ['!fonts.googleapis.com']
  var processImportFrom: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Set to false to skip URL rebasing
  var rebase: js.UndefOr[scala.Boolean] = js.undefined
  // Path to resolve relative @import rules and URLs
  var relativeTo: js.UndefOr[java.lang.String] = js.undefined
  // Set to false to disable restructuring in advanced optimizations
  var restructuring: js.UndefOr[scala.Boolean] = js.undefined
  // Path to resolve absolute @import rules and rebase relative URLs
  var root: js.UndefOr[java.lang.String] = js.undefined
  // Rounding precision; defaults to 2; -1 disables rounding
  var roundingPrecision: js.UndefOr[scala.Double] = js.undefined
  // Set to true to enable semantic merging mode which assumes BEM-like content (default is false as it's highly likely this will break your stylesheets - use with caution!)
  var semanticMerging: js.UndefOr[scala.Boolean] = js.undefined
  // Set to false to skip shorthand compacting (default is true unless sourceMap is set when it's false)
  var shorthandCompacting: js.UndefOr[scala.Boolean] = js.undefined
  // Exposes source map under sourceMap property, e.g. new CleanCSS().minify(source).sourceMap (default is false) If input styles are a product of CSS preprocessor (Less, Sass) an input source map can be passed as a string.
  var sourceMap: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  // Set to true to inline sources inside a source map's sourcesContent field (defaults to false) It is also required to process inlined sources from input source maps.
  var sourceMapInlineSources: js.UndefOr[scala.Boolean] = js.undefined
  // Path to a folder or an output file to which rebase all URLs
  var target: js.UndefOr[java.lang.String] = js.undefined
}

