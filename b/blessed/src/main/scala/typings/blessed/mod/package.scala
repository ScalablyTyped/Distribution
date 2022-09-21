package typings.blessed.mod

import typings.blessed.mod.Widgets.BigTextElement
import typings.blessed.mod.Widgets.BigTextOptions
import typings.blessed.mod.Widgets.BoxElement
import typings.blessed.mod.Widgets.BoxOptions
import typings.blessed.mod.Widgets.ButtonElement
import typings.blessed.mod.Widgets.ButtonOptions
import typings.blessed.mod.Widgets.CheckboxElement
import typings.blessed.mod.Widgets.CheckboxOptions
import typings.blessed.mod.Widgets.FileManagerElement
import typings.blessed.mod.Widgets.FileManagerOptions
import typings.blessed.mod.Widgets.FormElement
import typings.blessed.mod.Widgets.FormOptions
import typings.blessed.mod.Widgets.IScreenOptions
import typings.blessed.mod.Widgets.InputElement
import typings.blessed.mod.Widgets.InputOptions
import typings.blessed.mod.Widgets.LayoutElement
import typings.blessed.mod.Widgets.LayoutOptions
import typings.blessed.mod.Widgets.LineElement
import typings.blessed.mod.Widgets.LineOptions
import typings.blessed.mod.Widgets.ListElement
import typings.blessed.mod.Widgets.ListElementStyle
import typings.blessed.mod.Widgets.ListOptions
import typings.blessed.mod.Widgets.ListTableElement
import typings.blessed.mod.Widgets.ListTableOptions
import typings.blessed.mod.Widgets.ListbarElement
import typings.blessed.mod.Widgets.ListbarOptions
import typings.blessed.mod.Widgets.LoadingElement
import typings.blessed.mod.Widgets.LoadingOptions
import typings.blessed.mod.Widgets.Log
import typings.blessed.mod.Widgets.LogOptions
import typings.blessed.mod.Widgets.MessageElement
import typings.blessed.mod.Widgets.MessageOptions
import typings.blessed.mod.Widgets.ProgressBarElement
import typings.blessed.mod.Widgets.ProgressBarOptions
import typings.blessed.mod.Widgets.PromptElement
import typings.blessed.mod.Widgets.PromptOptions
import typings.blessed.mod.Widgets.QuestionElement
import typings.blessed.mod.Widgets.QuestionOptions
import typings.blessed.mod.Widgets.RadioButtonElement
import typings.blessed.mod.Widgets.RadioButtonOptions
import typings.blessed.mod.Widgets.RadioSetElement
import typings.blessed.mod.Widgets.RadioSetOptions
import typings.blessed.mod.Widgets.Screen
import typings.blessed.mod.Widgets.TableElement
import typings.blessed.mod.Widgets.TableOptions
import typings.blessed.mod.Widgets.TerminalElement
import typings.blessed.mod.Widgets.TerminalOptions
import typings.blessed.mod.Widgets.TextElement
import typings.blessed.mod.Widgets.TextOptions
import typings.blessed.mod.Widgets.TextareaElement
import typings.blessed.mod.Widgets.TextareaOptions
import typings.blessed.mod.Widgets.TextboxElement
import typings.blessed.mod.Widgets.TextboxOptions
import typings.blessed.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def bigtext(): BigTextElement = ^.asInstanceOf[js.Dynamic].applyDynamic("bigtext")().asInstanceOf[BigTextElement]
inline def bigtext(options: BigTextOptions): BigTextElement = ^.asInstanceOf[js.Dynamic].applyDynamic("bigtext")(options.asInstanceOf[js.Any]).asInstanceOf[BigTextElement]

inline def box(): BoxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("box")().asInstanceOf[BoxElement]
inline def box(options: BoxOptions): BoxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("box")(options.asInstanceOf[js.Any]).asInstanceOf[BoxElement]

inline def button(): ButtonElement = ^.asInstanceOf[js.Dynamic].applyDynamic("button")().asInstanceOf[ButtonElement]
inline def button(options: ButtonOptions): ButtonElement = ^.asInstanceOf[js.Dynamic].applyDynamic("button")(options.asInstanceOf[js.Any]).asInstanceOf[ButtonElement]

inline def checkbox(): CheckboxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("checkbox")().asInstanceOf[CheckboxElement]
inline def checkbox(options: CheckboxOptions): CheckboxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("checkbox")(options.asInstanceOf[js.Any]).asInstanceOf[CheckboxElement]

inline def cleanTags(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanTags")(text.asInstanceOf[js.Any]).asInstanceOf[String]

inline def escape(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(text.asInstanceOf[js.Any]).asInstanceOf[String]

inline def filemanager(): FileManagerElement = ^.asInstanceOf[js.Dynamic].applyDynamic("filemanager")().asInstanceOf[FileManagerElement]
inline def filemanager(options: FileManagerOptions): FileManagerElement = ^.asInstanceOf[js.Dynamic].applyDynamic("filemanager")(options.asInstanceOf[js.Any]).asInstanceOf[FileManagerElement]

inline def form[TFormData](): FormElement[TFormData] = ^.asInstanceOf[js.Dynamic].applyDynamic("form")().asInstanceOf[FormElement[TFormData]]
inline def form[TFormData](options: FormOptions): FormElement[TFormData] = ^.asInstanceOf[js.Dynamic].applyDynamic("form")(options.asInstanceOf[js.Any]).asInstanceOf[FormElement[TFormData]]

inline def generateTags(style: Any, text: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTags")(style.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]

inline def input(): InputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("input")().asInstanceOf[InputElement]
inline def input(options: InputOptions): InputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(options.asInstanceOf[js.Any]).asInstanceOf[InputElement]

inline def layout(): LayoutElement = ^.asInstanceOf[js.Dynamic].applyDynamic("layout")().asInstanceOf[LayoutElement]
inline def layout(options: LayoutOptions): LayoutElement = ^.asInstanceOf[js.Dynamic].applyDynamic("layout")(options.asInstanceOf[js.Any]).asInstanceOf[LayoutElement]

inline def line(): LineElement = ^.asInstanceOf[js.Dynamic].applyDynamic("line")().asInstanceOf[LineElement]
inline def line(options: LineOptions): LineElement = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(options.asInstanceOf[js.Any]).asInstanceOf[LineElement]

inline def list(): ListElement = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[ListElement]
inline def list(options: ListOptions[ListElementStyle]): ListElement = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any]).asInstanceOf[ListElement]

inline def listbar(): ListbarElement = ^.asInstanceOf[js.Dynamic].applyDynamic("listbar")().asInstanceOf[ListbarElement]
inline def listbar(options: ListbarOptions): ListbarElement = ^.asInstanceOf[js.Dynamic].applyDynamic("listbar")(options.asInstanceOf[js.Any]).asInstanceOf[ListbarElement]

inline def listtable(): ListTableElement = ^.asInstanceOf[js.Dynamic].applyDynamic("listtable")().asInstanceOf[ListTableElement]
inline def listtable(options: ListTableOptions): ListTableElement = ^.asInstanceOf[js.Dynamic].applyDynamic("listtable")(options.asInstanceOf[js.Any]).asInstanceOf[ListTableElement]

inline def loading(): LoadingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("loading")().asInstanceOf[LoadingElement]
inline def loading(options: LoadingOptions): LoadingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("loading")(options.asInstanceOf[js.Any]).asInstanceOf[LoadingElement]

inline def log(): Log = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[Log]
inline def log(options: LogOptions): Log = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(options.asInstanceOf[js.Any]).asInstanceOf[Log]

inline def message(): MessageElement = ^.asInstanceOf[js.Dynamic].applyDynamic("message")().asInstanceOf[MessageElement]
inline def message(options: MessageOptions): MessageElement = ^.asInstanceOf[js.Dynamic].applyDynamic("message")(options.asInstanceOf[js.Any]).asInstanceOf[MessageElement]

inline def parseTags(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTags")(text.asInstanceOf[js.Any]).asInstanceOf[String]
inline def parseTags(text: String, screen: Screen): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTags")(text.asInstanceOf[js.Any], screen.asInstanceOf[js.Any])).asInstanceOf[String]

inline def program(): BlessedProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("program")().asInstanceOf[BlessedProgram]
inline def program(options: IScreenOptions): BlessedProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("program")(options.asInstanceOf[js.Any]).asInstanceOf[BlessedProgram]

inline def progressbar(): ProgressBarElement = ^.asInstanceOf[js.Dynamic].applyDynamic("progressbar")().asInstanceOf[ProgressBarElement]
inline def progressbar(options: ProgressBarOptions): ProgressBarElement = ^.asInstanceOf[js.Dynamic].applyDynamic("progressbar")(options.asInstanceOf[js.Any]).asInstanceOf[ProgressBarElement]

inline def prompt(): PromptElement = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")().asInstanceOf[PromptElement]
inline def prompt(options: PromptOptions): PromptElement = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(options.asInstanceOf[js.Any]).asInstanceOf[PromptElement]

inline def question(): QuestionElement = ^.asInstanceOf[js.Dynamic].applyDynamic("question")().asInstanceOf[QuestionElement]
inline def question(options: QuestionOptions): QuestionElement = ^.asInstanceOf[js.Dynamic].applyDynamic("question")(options.asInstanceOf[js.Any]).asInstanceOf[QuestionElement]

inline def radiobutton(): RadioButtonElement = ^.asInstanceOf[js.Dynamic].applyDynamic("radiobutton")().asInstanceOf[RadioButtonElement]
inline def radiobutton(options: RadioButtonOptions): RadioButtonElement = ^.asInstanceOf[js.Dynamic].applyDynamic("radiobutton")(options.asInstanceOf[js.Any]).asInstanceOf[RadioButtonElement]

inline def radioset(): RadioSetElement = ^.asInstanceOf[js.Dynamic].applyDynamic("radioset")().asInstanceOf[RadioSetElement]
inline def radioset(options: RadioSetOptions): RadioSetElement = ^.asInstanceOf[js.Dynamic].applyDynamic("radioset")(options.asInstanceOf[js.Any]).asInstanceOf[RadioSetElement]

inline def screen(): Screen = ^.asInstanceOf[js.Dynamic].applyDynamic("screen")().asInstanceOf[Screen]
inline def screen(options: IScreenOptions): Screen = ^.asInstanceOf[js.Dynamic].applyDynamic("screen")(options.asInstanceOf[js.Any]).asInstanceOf[Screen]

inline def scrollablebox(): BoxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollablebox")().asInstanceOf[BoxElement]
inline def scrollablebox(options: BoxOptions): BoxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollablebox")(options.asInstanceOf[js.Any]).asInstanceOf[BoxElement]

inline def scrollabletext(): BoxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollabletext")().asInstanceOf[BoxElement]
inline def scrollabletext(options: BoxOptions): BoxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollabletext")(options.asInstanceOf[js.Any]).asInstanceOf[BoxElement]

inline def stripTags(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTags")(text.asInstanceOf[js.Any]).asInstanceOf[String]

inline def table(): TableElement = ^.asInstanceOf[js.Dynamic].applyDynamic("table")().asInstanceOf[TableElement]
inline def table(options: TableOptions): TableElement = ^.asInstanceOf[js.Dynamic].applyDynamic("table")(options.asInstanceOf[js.Any]).asInstanceOf[TableElement]

inline def terminal(): TerminalElement = ^.asInstanceOf[js.Dynamic].applyDynamic("terminal")().asInstanceOf[TerminalElement]
inline def terminal(options: TerminalOptions): TerminalElement = ^.asInstanceOf[js.Dynamic].applyDynamic("terminal")(options.asInstanceOf[js.Any]).asInstanceOf[TerminalElement]

inline def text(): TextElement = ^.asInstanceOf[js.Dynamic].applyDynamic("text")().asInstanceOf[TextElement]
inline def text(options: TextOptions): TextElement = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(options.asInstanceOf[js.Any]).asInstanceOf[TextElement]

inline def textarea(): TextareaElement = ^.asInstanceOf[js.Dynamic].applyDynamic("textarea")().asInstanceOf[TextareaElement]
inline def textarea(options: TextareaOptions): TextareaElement = ^.asInstanceOf[js.Dynamic].applyDynamic("textarea")(options.asInstanceOf[js.Any]).asInstanceOf[TextareaElement]

inline def textbox(): TextboxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("textbox")().asInstanceOf[TextboxElement]
inline def textbox(options: TextboxOptions): TextboxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("textbox")(options.asInstanceOf[js.Any]).asInstanceOf[TextboxElement]
