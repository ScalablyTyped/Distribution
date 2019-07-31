package typings.blessed.blessedMod

import typings.blessed.blessedMod.WidgetsNs.BigTextElement
import typings.blessed.blessedMod.WidgetsNs.BigTextOptions
import typings.blessed.blessedMod.WidgetsNs.BoxElement
import typings.blessed.blessedMod.WidgetsNs.BoxOptions
import typings.blessed.blessedMod.WidgetsNs.ButtonElement
import typings.blessed.blessedMod.WidgetsNs.ButtonOptions
import typings.blessed.blessedMod.WidgetsNs.CheckboxElement
import typings.blessed.blessedMod.WidgetsNs.CheckboxOptions
import typings.blessed.blessedMod.WidgetsNs.FileManagerElement
import typings.blessed.blessedMod.WidgetsNs.FileManagerOptions
import typings.blessed.blessedMod.WidgetsNs.FormElement
import typings.blessed.blessedMod.WidgetsNs.FormOptions
import typings.blessed.blessedMod.WidgetsNs.IScreenOptions
import typings.blessed.blessedMod.WidgetsNs.InputElement
import typings.blessed.blessedMod.WidgetsNs.InputOptions
import typings.blessed.blessedMod.WidgetsNs.LayoutElement
import typings.blessed.blessedMod.WidgetsNs.LayoutOptions
import typings.blessed.blessedMod.WidgetsNs.LineElement
import typings.blessed.blessedMod.WidgetsNs.LineOptions
import typings.blessed.blessedMod.WidgetsNs.ListElement
import typings.blessed.blessedMod.WidgetsNs.ListElementStyle
import typings.blessed.blessedMod.WidgetsNs.ListOptions
import typings.blessed.blessedMod.WidgetsNs.ListTableElement
import typings.blessed.blessedMod.WidgetsNs.ListTableOptions
import typings.blessed.blessedMod.WidgetsNs.ListbarElement
import typings.blessed.blessedMod.WidgetsNs.ListbarOptions
import typings.blessed.blessedMod.WidgetsNs.LoadingElement
import typings.blessed.blessedMod.WidgetsNs.LoadingOptions
import typings.blessed.blessedMod.WidgetsNs.Log
import typings.blessed.blessedMod.WidgetsNs.LogOptions
import typings.blessed.blessedMod.WidgetsNs.MessageElement
import typings.blessed.blessedMod.WidgetsNs.MessageOptions
import typings.blessed.blessedMod.WidgetsNs.ProgressBarElement
import typings.blessed.blessedMod.WidgetsNs.ProgressBarOptions
import typings.blessed.blessedMod.WidgetsNs.PromptElement
import typings.blessed.blessedMod.WidgetsNs.PromptOptions
import typings.blessed.blessedMod.WidgetsNs.QuestionElement
import typings.blessed.blessedMod.WidgetsNs.QuestionOptions
import typings.blessed.blessedMod.WidgetsNs.RadioButtonElement
import typings.blessed.blessedMod.WidgetsNs.RadioButtonOptions
import typings.blessed.blessedMod.WidgetsNs.RadioSetElement
import typings.blessed.blessedMod.WidgetsNs.RadioSetOptions
import typings.blessed.blessedMod.WidgetsNs.Screen
import typings.blessed.blessedMod.WidgetsNs.TableElement
import typings.blessed.blessedMod.WidgetsNs.TableOptions
import typings.blessed.blessedMod.WidgetsNs.TerminalElement
import typings.blessed.blessedMod.WidgetsNs.TerminalOptions
import typings.blessed.blessedMod.WidgetsNs.TextElement
import typings.blessed.blessedMod.WidgetsNs.TextOptions
import typings.blessed.blessedMod.WidgetsNs.TextareaElement
import typings.blessed.blessedMod.WidgetsNs.TextareaOptions
import typings.blessed.blessedMod.WidgetsNs.TextboxElement
import typings.blessed.blessedMod.WidgetsNs.TextboxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bigtext(): BigTextElement = js.native
  def bigtext(options: BigTextOptions): BigTextElement = js.native
  def box(): BoxElement = js.native
  def box(options: BoxOptions): BoxElement = js.native
  def button(): ButtonElement = js.native
  def button(options: ButtonOptions): ButtonElement = js.native
  def checkbox(): CheckboxElement = js.native
  def checkbox(options: CheckboxOptions): CheckboxElement = js.native
  def cleanTags(text: String): String = js.native
  def escape(text: String): String = js.native
  def filemanager(): FileManagerElement = js.native
  def filemanager(options: FileManagerOptions): FileManagerElement = js.native
  def form[TFormData](): FormElement[TFormData] = js.native
  def form[TFormData](options: FormOptions): FormElement[TFormData] = js.native
  def generateTags(style: js.Any, text: String): String = js.native
  def input(): InputElement = js.native
  def input(options: InputOptions): InputElement = js.native
  def layout(): LayoutElement = js.native
  def layout(options: LayoutOptions): LayoutElement = js.native
  def line(): LineElement = js.native
  def line(options: LineOptions): LineElement = js.native
  def list(): ListElement = js.native
  def list(options: ListOptions[ListElementStyle]): ListElement = js.native
  def listbar(): ListbarElement = js.native
  def listbar(options: ListbarOptions): ListbarElement = js.native
  def listtable(): ListTableElement = js.native
  def listtable(options: ListTableOptions): ListTableElement = js.native
  def loading(): LoadingElement = js.native
  def loading(options: LoadingOptions): LoadingElement = js.native
  def log(): Log = js.native
  def log(options: LogOptions): Log = js.native
  def message(): MessageElement = js.native
  def message(options: MessageOptions): MessageElement = js.native
  def program(): BlessedProgram = js.native
  def program(options: IScreenOptions): BlessedProgram = js.native
  def progressbar(): ProgressBarElement = js.native
  def progressbar(options: ProgressBarOptions): ProgressBarElement = js.native
  def prompt(): PromptElement = js.native
  def prompt(options: PromptOptions): PromptElement = js.native
  def question(): QuestionElement = js.native
  def question(options: QuestionOptions): QuestionElement = js.native
  def radiobutton(): RadioButtonElement = js.native
  def radiobutton(options: RadioButtonOptions): RadioButtonElement = js.native
  def radioset(): RadioSetElement = js.native
  def radioset(options: RadioSetOptions): RadioSetElement = js.native
  def screen(): Screen = js.native
  def screen(options: IScreenOptions): Screen = js.native
  def scrollablebox(): BoxElement = js.native
  def scrollablebox(options: BoxOptions): BoxElement = js.native
  def scrollabletext(): BoxElement = js.native
  def scrollabletext(options: BoxOptions): BoxElement = js.native
  def stripTags(text: String): String = js.native
  def table(): TableElement = js.native
  def table(options: TableOptions): TableElement = js.native
  def terminal(): TerminalElement = js.native
  def terminal(options: TerminalOptions): TerminalElement = js.native
  def text(): TextElement = js.native
  def text(options: TextOptions): TextElement = js.native
  def textarea(): TextareaElement = js.native
  def textarea(options: TextareaOptions): TextareaElement = js.native
  def textbox(): TextboxElement = js.native
  def textbox(options: TextboxOptions): TextboxElement = js.native
}

