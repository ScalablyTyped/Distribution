package typings
package braftDashEditorLib.braftDashEditorMod.BraftEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait editorProps extends js.Object {
  var allowSetTextBackgroundColor: js.UndefOr[scala.Boolean] = js.undefined
  var blur: js.UndefOr[js.Function0[_]] = js.undefined
  var clear: js.UndefOr[js.Function0[_]] = js.undefined
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var contentFormat: js.UndefOr[
    braftDashEditorLib.braftDashEditorLibStrings.raw | braftDashEditorLib.braftDashEditorLibStrings.html
  ] = js.undefined
  var contentId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var controls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var editorState: js.UndefOr[js.Any] = js.undefined
  var emojis: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var excludeControls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var extendAtomics: js.UndefOr[js.Array[_]] = js.undefined
  var extendControls: js.UndefOr[js.Array[_]] = js.undefined
  var focus: js.UndefOr[js.Function0[_]] = js.undefined
  var fontFamilies: js.UndefOr[js.Array[fontFamiliesRange]] = js.undefined
  var fontSizes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var forceNewLine: js.UndefOr[scala.Boolean] = js.undefined
  var forceRender: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var getContent: js.UndefOr[
    js.Function1[
      /* format */ js.UndefOr[java.lang.String], 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState
    ]
  ] = js.undefined
  var getDraftInstance: js.UndefOr[js.Function0[_]] = js.undefined
  var getEditorState: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var getMediaLibraryInstance: js.UndefOr[js.Function0[_]] = js.undefined
  var getSelectionBlockType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var getSelectionInlineStyle: js.UndefOr[js.Function0[_]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var imageControls: js.UndefOr[js.Any] = js.undefined
  var indents: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var initialContent: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var insertHTML: js.UndefOr[js.Function1[/* htmlString */ java.lang.String, _]] = js.undefined
  var insertMedias: js.UndefOr[js.Function1[/* medias */ js.Array[braftDashEditorLib.Anon_Type], _]] = js.undefined
  var insertText: js.UndefOr[
    js.Function2[/* text */ java.lang.String, /* replace */ js.UndefOr[scala.Boolean], _]
  ] = js.undefined
  var isEmpty: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var letterSpacings: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var lineHeights: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var media: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  var onBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* content */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState, 
      scala.Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onHTMLChange: js.UndefOr[js.Function1[/* content */ java.lang.String, scala.Unit]] = js.undefined
  var onRawChange: js.UndefOr[
    js.Function1[
      /* content */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState, 
      scala.Unit
    ]
  ] = js.undefined
  var onSave: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTab: js.UndefOr[js.Function1[/* event */ reactLib.Event, scala.Unit]] = js.undefined
  var pasteMode: js.UndefOr[
    braftDashEditorLib.braftDashEditorLibStrings.text | braftDashEditorLib.braftDashEditorLibStrings.Empty
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var redo: js.UndefOr[js.Function0[_]] = js.undefined
  var selectionCollapsed: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var selectionHasInlineStyle: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var setContent: js.UndefOr[
    js.Function2[
      /* content */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState, 
      /* format */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var tabIndents: js.UndefOr[scala.Double] = js.undefined
  var textAlignOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var toggleSelectionAlignment: js.UndefOr[js.Function1[/* alignment */ java.lang.String, _]] = js.undefined
  var toggleSelectionBackgroundColor: js.UndefOr[js.Function1[/* hexColor */ java.lang.String, scala.Unit]] = js.undefined
  var toggleSelectionBlockType: js.UndefOr[js.Function1[/* blockquote */ java.lang.String, _]] = js.undefined
  var toggleSelectionColor: js.UndefOr[js.Function1[/* hexColor */ java.lang.String, scala.Unit]] = js.undefined
  var toggleSelectionFontFamily: js.UndefOr[js.Function1[/* fontFamily */ java.lang.String, scala.Unit]] = js.undefined
  var toggleSelectionFontSize: js.UndefOr[js.Function1[/* fontSize */ scala.Double, scala.Unit]] = js.undefined
  var toggleSelectionInlineStyle: js.UndefOr[
    js.Function2[
      /* style */ java.lang.String, 
      /* stylesToBeRemoved */ js.UndefOr[js.Array[java.lang.String]], 
      _
    ]
  ] = js.undefined
  var toggleSelectionLink: js.UndefOr[
    js.Function2[/* href */ java.lang.String, /* target */ java.lang.String, scala.Unit]
  ] = js.undefined
  var undo: js.UndefOr[js.Function0[_]] = js.undefined
  var viewWrapper: js.UndefOr[java.lang.String] = js.undefined
}

