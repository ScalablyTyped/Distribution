package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs.MergeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
       * Options available to MergeView.
       */

trait MergeViewEditorConfiguration
  extends codemirrorLib.codemirrorMod.CodeMirrorNs.EditorConfiguration {
  /**
             * Determines whether the original editor allows editing. Defaults to false.
             */
  var allowEditingOriginals: js.UndefOr[scala.Boolean] = js.undefined
  /**
             * When true stretches of unchanged text will be collapsed. When a number is given, this indicates the amount
             * of lines to leave visible around such stretches (which defaults to 2). Defaults to false.
             */
  var collapseIdentical: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
             * Sets the style used to connect changed chunks of code. By default, connectors are drawn. When this is set to "align",
             * the smaller chunk is padded to align with the bigger chunk instead.
             */
  var connect: js.UndefOr[java.lang.String] = js.undefined
  /**
             * Callback for when stretches of unchanged text are collapsed.
             */
  var onCollapse: js.UndefOr[
    js.Function4[
      /* mergeView */ MergeViewEditor, 
      /* line */ scala.Double, 
      /* size */ scala.Double, 
      /* mark */ codemirrorLib.codemirrorMod.CodeMirrorNs.TextMarker, 
      scala.Unit
    ]
  ] = js.undefined
  /**
             * Provides original version of the document to be shown on the right of the editor.
             */
  var orig: js.Any
  /**
             * Provides original version of the document to be shown on the left of the editor.
             * To create a 2-way (as opposed to 3-way) merge view, provide only one of origLeft and origRight.
             */
  var origLeft: js.UndefOr[js.Any] = js.undefined
  /**
             * Provides original version of document to be shown on the right of the editor.
             * To create a 2-way (as opposed to 3-way) merge view, provide only one of origLeft and origRight.
             */
  var origRight: js.UndefOr[js.Any] = js.undefined
  /**
             * Determines whether buttons that allow the user to revert changes are shown. Defaults to true.
             */
  var revertButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
             * When true, changed pieces of text are highlighted. Defaults to true.
             */
  var showDifferences: js.UndefOr[scala.Boolean] = js.undefined
}

