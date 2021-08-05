package typings.chordsheetjs

import typings.chordsheetjs.chordsheetjsStrings.chorus
import typings.chordsheetjs.chordsheetjsStrings.none
import typings.chordsheetjs.chordsheetjsStrings.verse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chordsheetjs", "ChordLyricsPair")
  @js.native
  class ChordLyricsPair protected () extends StObject {
    /**
      * Initialises a ChordLyricsPair
      * @param chords The chords
      * @param lyrics The lyrics
      */
    def this(chords: String, lyrics: String) = this()
    
    var chords: String = js.native
    
    /**
      * Indicates whether a ChordLyricsPair should be visible in a formatted chord sheet (except for ChordPro sheets)
      */
    def isRenderable(): Boolean = js.native
    
    var lyrics: String = js.native
  }
  
  @JSImport("chordsheetjs", "ChordProFormatter")
  @js.native
  class ChordProFormatter () extends StObject {
    
    /**
      * Formats a song into a ChordPro chord sheet.
      * @param song The song to be formatted
      */
    def format(song: Song): String = js.native
    
    def formatChordLyricsPair(chordLyricsPair: ChordLyricsPair): String = js.native
    
    def formatChordLyricsPairChords(chordLyricsPair: ChordLyricsPair): String = js.native
    
    def formatChordLyricsPairLyrics(chordLyricsPair: ChordLyricsPair): String = js.native
    
    def formatItem(item: ChordLyricsPair): String = js.native
    def formatItem(item: Line): String = js.native
    def formatItem(item: Tag): String = js.native
    
    def formatLine(line: Line): String = js.native
    
    def formatTag(tag: Tag): String = js.native
  }
  
  @JSImport("chordsheetjs", "ChordProParser")
  @js.native
  class ChordProParser () extends StObject {
    
    def addWarning(message: String): Unit = js.native
    
    def applyTag(tag: Tag): Unit = js.native
    
    def checkCurrentSectionType(sectionType: String, tag: Tag): Unit = js.native
    
    def endSection(sectionType: String, tag: Tag): Unit = js.native
    
    def finishTag(): Unit = js.native
    
    var lineNumber: Double = js.native
    
    /**
      * Parses a ChordPro chord sheet into a song
      * @param chordProChordSheet The ChordPro chord sheet
      */
    def parse(chordProChordSheet: String): Song = js.native
    
    def parseDocument(document: String): Unit = js.native
    
    def readChords(chr: String): Unit = js.native
    
    def readComment(chr: String): Unit = js.native
    
    def readLyrics(chr: String): Unit = js.native
    
    def readTag(chr: String): Unit = js.native
    
    def resetTag(): Unit = js.native
    
    var sectionType: String = js.native
    
    var song: Song = js.native
    
    def startSection(sectionType: String, tag: Tag): Unit = js.native
    
    var warnings: js.Array[ParserWarning] = js.native
  }
  
  @JSImport("chordsheetjs", "ChordSheetParser")
  @js.native
  class ChordSheetParser protected () extends StObject {
    def this(props: ChordSheetParserProps) = this()
    
    def addCharacter(chr: String, nextChar: String): Unit = js.native
    
    var chordLyricsPair: ChordLyricsPair = js.native
    
    var currentLine: Double = js.native
    
    def ensureChordLyricsPairInitialized(): Unit = js.native
    
    def hasNextLine(): Boolean = js.native
    
    def initialize(document: String): Unit = js.native
    
    var lineCount: Double = js.native
    
    var lines: js.Array[Line] = js.native
    
    /**
      * Parses a chord sheet into a song
      * @param chordSheet The ChordPro chord sheet
      */
    def parse(chordSheet: String): Song = js.native
    
    def parseLine(line: String): Unit = js.native
    
    def parseLyricsWithChords(chordsLine: String, lyricsLine: String): Unit = js.native
    
    def parseNonEmptyLine(line: String): Unit = js.native
    
    var preserveWhitespace: Boolean = js.native
    
    def processCharacters(chordsLine: String, lyricsLine: String): Unit = js.native
    
    var processingText: String = js.native
    
    def readLine(): Line = js.native
    
    def shouldAddCharacterToChords(nextChar: String): Boolean = js.native
    
    var song: Song = js.native
    
    var songLine: Line = js.native
  }
  
  @JSImport("chordsheetjs", "HtmlDivFormatter")
  @js.native
  class HtmlDivFormatter () extends StObject {
    
    /**
      * Formats a song into HTML.
      * @param song The song to be formatted
      */
    def format(song: Song): String = js.native
  }
  
  @JSImport("chordsheetjs", "HtmlTableFormatter")
  @js.native
  class HtmlTableFormatter () extends StObject {
    
    /**
      * Formats a song into HTML.
      * @param song The song to be formatted
      */
    def format(song: Song): String = js.native
  }
  
  @JSImport("chordsheetjs", "Line")
  @js.native
  class Line () extends StObject {
    
    def addChordLyricsPair(chords: String, lyrics: String): ChordLyricsPair = js.native
    def addChordLyricsPair(chords: ChordLyricsPair, lyrics: String): ChordLyricsPair = js.native
    
    /**
      * Adds an item to the line
      * @param item The item to be added
      */
    def addItem(item: ChordLyricsPair): Unit = js.native
    def addItem(item: Tag): Unit = js.native
    
    def addTag(name: String): Tag = js.native
    def addTag(name: String, value: String): Tag = js.native
    def addTag(name: Tag): Tag = js.native
    def addTag(name: Tag, value: String): Tag = js.native
    
    def chords(chr: String): Unit = js.native
    
    def ensureChordLyricsPair(): Unit = js.native
    
    /**
      * Indicates whether the line contains items that are renderable. Please use hasRenderableItems
      * @deprecated
      */
    def hasContent(): Boolean = js.native
    
    /**
      * Indicates whether the line contains items that are renderable
      */
    def hasRenderableItems(): Boolean = js.native
    
    /**
      * Indicates whether the line type is 'chorus'
      */
    def isChorus(): Boolean = js.native
    
    /**
      * Indicates whether the line contains any items
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * Indicates whether the line type is 'verse'
      */
    def isVerse(): Boolean = js.native
    
    /**
      * The items (ChordLyricsPair or Tag) of which the line consists
      */
    var items: js.Array[ChordLyricsPair | Tag] = js.native
    
    def lyrics(chr: String): Unit = js.native
    
    /**
      * The line type, This is set by the ChordProParser when it read tags like {start_of_chorus} or {start_of_verse}
      * Values can be 'verse', 'chorus' or 'none'
      */
    var `type`: verse | chorus | none = js.native
  }
  
  @JSImport("chordsheetjs", "Paragraph")
  @js.native
  class Paragraph () extends StObject {
    
    def addLine(line: Line): Unit = js.native
    
    /**
      * The Line items of which the paragraph consists
      */
    var lines: js.Array[Line] = js.native
    
    /**
      * Tries to determine the common type for all lines. If the types for all lines are equal, it returns that type.
      * If not, it returns 'indeterminate'.
      */
    var `type`: String = js.native
  }
  
  @JSImport("chordsheetjs", "ParserWarning")
  @js.native
  class ParserWarning () extends StObject {
    
    /**
      * The line number on which the warning occurred
      */
    var lineNumber: String = js.native
    
    /**
      * The warning message
      */
    var message: String = js.native
  }
  
  @JSImport("chordsheetjs", "Song")
  @js.native
  class Song protected () extends StObject {
    def this(metadata: js.Object) = this()
    
    def addChordLyricsPair(): ChordLyricsPair = js.native
    
    def addLine(): Line = js.native
    
    def addParagraph(): Paragraph = js.native
    
    def addTag(tagContents: String): Tag = js.native
    
    def assignMetaData(metadata: js.Object): Unit = js.native
    
    /**
      * Returns the song lines, skipping the leading empty lines (empty as in not rendering any content). This is useful
      * if you want to skip the "header lines": the lines that only contain meta data.
      */
    var bodyLines: js.Array[Line] = js.native
    
    def chords(chr: String): Unit = js.native
    
    var currentLine: Line = js.native
    
    var currentParagraph: Paragraph = js.native
    
    def ensureLine(): Unit = js.native
    
    def ensureParagraph(): Unit = js.native
    
    def finish(): Unit = js.native
    
    def flushLine(): Unit = js.native
    
    def getMetaData(name: String): String | Null = js.native
    
    def getOptimizedMetaData(): js.Object = js.native
    
    /**
      * The Line items of which the song consists
      */
    var lines: js.Array[Line] = js.native
    
    def lyrics(chr: String): Unit = js.native
    
    var metaData: js.Object = js.native
    
    def optimizeMetaDataValue(): String | js.Array[String] | Null = js.native
    def optimizeMetaDataValue(valueSet: js.Array[String]): String | js.Array[String] | Null = js.native
    
    var optimizedMetaData: js.Object = js.native
    
    /**
      * The Paragraph items of which the song consists
      */
    var paragraphs: js.Array[Paragraph] = js.native
    
    def setCurrentLineType(`type`: String): Unit = js.native
    
    def setMetaData(name: String, value: String): Unit = js.native
  }
  
  @JSImport("chordsheetjs", "Tag")
  @js.native
  class Tag protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, value: String) = this()
    
    /**
      * Checks whether the tag value is a non-empty string.
      */
    def hasValue(): Boolean = js.native
    
    /**
      * Checks whether the tag is either a standard meta tag or a custom meta directive (`{x_some_name}`)
      */
    def isMetaTag(): Boolean = js.native
    
    /**
      * Checks whether the tag is usually rendered inline. It currently only applies to comment tags.
      */
    def isRenderable(): Boolean = js.native
    
    /**
      * The tag full name. When the original tag used the short name, `name` will return the full name.
      */
    var name: String = js.native
    
    /**
      * The original tag name that was used to construct the tag.
      */
    var originalName: String = js.native
    
    /**
      * The tag value
      */
    var value: String | Null = js.native
  }
  /* static members */
  object Tag {
    
    @JSImport("chordsheetjs", "Tag")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(tag: String): Tag | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag | Null]
    
    inline def parseWithRegex(tag: String, regex: String): Tag | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithRegex")(tag.asInstanceOf[js.Any], regex.asInstanceOf[js.Any])).asInstanceOf[Tag | Null]
  }
  
  @JSImport("chordsheetjs", "TextFormatter")
  @js.native
  class TextFormatter () extends StObject {
    
    def chordLyricsPairLength(chordLyricsPair: ChordLyricsPair): Double = js.native
    
    /**
      * Formats a song into a plain text chord sheet
      * @param song The song to be formatted
      */
    def format(song: Song): String = js.native
    
    def formatHeader(header: SongHeader): String = js.native
    
    def formatItemBottom(item: ChordLyricsPair): String = js.native
    def formatItemBottom(item: Line): String = js.native
    def formatItemBottom(item: Tag): String = js.native
    
    def formatItemTop(item: ChordLyricsPair): String = js.native
    def formatItemTop(item: Line): String = js.native
    def formatItemTop(item: Tag): String = js.native
    
    def formatLine(line: Line): String = js.native
    
    def formatLineBottom(line: Line): String = js.native
    
    def formatLineWithFormatter(line: Line, formatter: js.Function1[/* x */ String, String]): String = js.native
    
    def formatParagraph(paragraph: Paragraph): String = js.native
    
    def formatParagraphs(song: Song): String = js.native
    
    def formatSubtitle(subtitle: String): String = js.native
    
    def formatTitle(title: String): String = js.native
    
    def formatTopLine(line: Line): String | Null = js.native
  }
  
  trait ChordSheetParserProps extends StObject {
    
    var preserveWhitespace: Boolean
  }
  object ChordSheetParserProps {
    
    inline def apply(preserveWhitespace: Boolean): ChordSheetParserProps = {
      val __obj = js.Dynamic.literal(preserveWhitespace = preserveWhitespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChordSheetParserProps]
    }
    
    extension [Self <: ChordSheetParserProps](x: Self) {
      
      inline def setPreserveWhitespace(value: Boolean): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait SongHeader extends StObject {
    
    var subtitle: String
    
    var title: String
  }
  object SongHeader {
    
    inline def apply(subtitle: String, title: String): SongHeader = {
      val __obj = js.Dynamic.literal(subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SongHeader]
    }
    
    extension [Self <: SongHeader](x: Self) {
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
